package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddCheckerController {

	@GetMapping("/check")
	
	public String check(@RequestParam int num) {
		if(num%2 == 0) {
			return num +"is an Even number";
		}else {
			return num + "is an odd number";
		}
	}
}
