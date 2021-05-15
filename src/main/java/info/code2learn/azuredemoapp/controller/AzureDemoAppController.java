package info.code2learn.azuredemoapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import info.code2learn.azuredemoapp.util.CassandraUtils;

@RestController
public class AzureDemoAppController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<>("Welcome to Azure Demo App.", HttpStatus.OK);
	}
	
}

