package com.phenricks.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phenricks.study.model.UserModel;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping(path = "/listAll")
	public ResponseEntity<UserModel> listAll() {
		UserModel teste = new UserModel(1, "Pedro", "pedro.teste@teste.com", "00123456789", "12345");
		return ResponseEntity.ok().body(teste);
	}
}
