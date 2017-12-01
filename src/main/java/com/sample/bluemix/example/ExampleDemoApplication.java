package com.sample.bluemix.example;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ExampleDemoApplication {

	public static void main(String[] args) {
            SpringApplication.run(ExampleDemoApplication.class, args);
	}

    @RequestMapping("/")
    public String index() {
	System.out.println("log message: Welcome to American Airline");        
	return "Welcome to American Airline !!!!";
    }
}
