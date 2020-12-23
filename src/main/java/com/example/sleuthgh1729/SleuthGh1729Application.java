package com.example.sleuthgh1729;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class SleuthGh1729Application {
	public static void main(String[] args) {
		SpringApplication.run(SleuthGh1729Application.class, args);
	}

	@Scheduled(fixedDelay = 1_000)
	public void scheduled() {
		log.info("hey!");
		throw new IllegalArgumentException("oops");
	}
}
