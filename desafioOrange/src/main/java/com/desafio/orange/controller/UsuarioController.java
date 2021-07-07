package com.desafio.orange.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping

public class UsuarioController {
	
	public String hello() {
		return "ola mundo";
	}

}
