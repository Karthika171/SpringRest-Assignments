package com.example.two.SpringRestHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService h;
	@GetMapping("hello")
	public String sayHello() {
		return h.hello();
	}
	
}
