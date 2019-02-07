package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.totest.SimpleController;

@RestController
public class WelcomeController {
	@Autowired
	SimpleController con;
	@RequestMapping("/welcome")

public String Welcome() {
		
	return con.retrives();
}
}