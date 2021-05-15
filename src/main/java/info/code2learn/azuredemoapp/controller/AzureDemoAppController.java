package info.code2learn.azuredemoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import info.code2learn.azuredemoapp.entity.User;
import info.code2learn.azuredemoapp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AzureDemoAppController {
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<>("Welcome to Azure Demo App.", HttpStatus.OK);
	}
	
	@PostMapping("/create-user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		log.debug("User: {}", user);
		return new ResponseEntity<User>(userRepository.insert(user), HttpStatus.CREATED);
	}
	
}

