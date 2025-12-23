package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	
	@GetMapping("/add")
	
	public String add(@RequestParam int a, @RequestParam int b) {
		return "Sum = "+(a+b);
	}

}
