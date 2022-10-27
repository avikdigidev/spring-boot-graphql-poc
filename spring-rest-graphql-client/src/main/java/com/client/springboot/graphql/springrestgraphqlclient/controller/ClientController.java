package com.client.springboot.graphql.springrestgraphqlclient.controller;

import com.client.springboot.graphql.springrestgraphqlclient.response.*;
import com.client.springboot.graphql.springrestgraphqlclient.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/student")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@GetMapping("/get/{id}")
	public StudentResponse getStudent(@PathVariable Integer id) {
		return clientService.getStudent(id);
	}
	
}
