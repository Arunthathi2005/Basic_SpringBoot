package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
//    public String greet(
//            @RequestParam(defaultValue = "Guest") String name) {
//
//        return "Hi " + name + "!";
//    }
    
    public String greetuser(@RequestParam(value = "name",required = false , defaultValue ="student")String name) {
    	
    	return "Hello," +name+ "!";
    }
}
