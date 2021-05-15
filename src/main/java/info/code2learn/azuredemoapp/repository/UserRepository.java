package info.code2learn.azuredemoapp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import info.code2learn.azuredemoapp.entity.User;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {

}
