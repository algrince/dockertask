package com.algrince.dockertask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockertaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseReader.class, args);
	}

}
