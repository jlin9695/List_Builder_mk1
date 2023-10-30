package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
    @GetMapping("/")
    public String index() {
        //Start my list controller here - set up lists?
        return "Greetings from Spring Boot!";
    }
}
