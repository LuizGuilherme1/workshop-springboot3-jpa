package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l, "joão", "joao@hotmail.com", "9979912034", "12302005");
		return ResponseEntity.ok().body(u);
	}
}
