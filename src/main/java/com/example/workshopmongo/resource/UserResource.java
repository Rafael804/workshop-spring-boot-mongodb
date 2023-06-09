package com.example.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aula.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity< List<User>> findAll(){
		User maria = new User(0, "1","Maria Brown","maria@gmail.com", null);
		User alex =  new User(0, "2","Alex Green","alex@gmail.com", null);
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex));
		return ResponseEntity.ok().body(list);
	}
}
