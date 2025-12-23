package controller;

import java.time.Year;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@GetMapping("/user/{name}/{birthyear}")
	
	public String CalculateAge(@PathVariable String name , @PathVariable int birthyear) {
		int currentyear = Year.now().getValue(); //2025
		
		int age = currentyear - birthyear;
		
		return "Hello "+name+", Your age is "+age+" Years.";
	}

}
