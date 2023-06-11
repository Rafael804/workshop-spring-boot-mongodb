package com.example.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aula.course.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findOne(String id);

	User findOne(long id);

	void delete(String id);

	void saveAll(List<com.example.workshopmongo.domain.User> asList);

	void saveAll(com.example.workshopmongo.domain.User maria);

	
}
