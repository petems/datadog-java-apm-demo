package com.nilushancosta.datadogjavaapmdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@SpringBootApplication
public class DatadogjavaapmdemoApplication {

	private static final Logger logger = LogManager.getLogger(DatadogjavaapmdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatadogjavaapmdemoApplication.class, args);
	}

	@GetMapping("/success")
	public String success(){
		logger.info("Call was made to /success!");
		return "Request successful";
	}

	@GetMapping("/failure")
	public String failure(){
		logger.info("Oh no! Call was made to /failure!");
		logger.error("Error happened");
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
