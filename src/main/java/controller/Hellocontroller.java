package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	@GetMapping("/")
	 public String sayHello() {
        return "Hello, Welcome !";
    }
    @GetMapping("/hello")
    public String say() {
        return "Spring Boot with Maven Project !";
    }
}