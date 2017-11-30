package ru.mail.park.sample42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class Sample42Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample42Application.class, args);
	}
}
