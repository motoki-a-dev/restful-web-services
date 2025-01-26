package com.in28minutes.rest.webservices.restful_web_services.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	private UserDaoService service;

	public UserResource(UserDaoService service) {
		this.service = service;
	}

	// ユーザーを全権取得する
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	// 対象IDを持つユーザーを取得する
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}

	// ユーザーを追加する
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(createdUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
