package com.nilushancosta.datadogjavaapmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@SpringBootApplication
public class DatadogjavaapmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatadogjavaapmdemoApplication.class, args);
	}

	@GetMapping("/success")
	public String success(){
		return "Request successful";
	}

	@GetMapping("/failure")
	public String failure(){
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
