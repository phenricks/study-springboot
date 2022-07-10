package com.phenricks.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {
	private static final Logger logger = LoggerFactory.getLogger(StudyApplication.class);

	public static String systemName = "Spring boot studies";
	public static String versionNumber = "1.0.0";
	public static String versionDate = "09/07/22";

	public static void main(String[] args) {
		logger.info("{} - {} - {}", systemName, versionNumber, versionDate);
		SpringApplication.run(StudyApplication.class, args);
	}

}
