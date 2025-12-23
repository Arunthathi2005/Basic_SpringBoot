package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginValidationController {
	
	@GetMapping("/login")
	
   public String login(@RequestParam String username,@RequestParam String password) {
		if(username.equals("admin")&& password.equals("admin123")) {
			return "Login Sucessful";
		}else {
			return "Invalid";
		}
	}

}
