package com.example.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aula.course.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}
