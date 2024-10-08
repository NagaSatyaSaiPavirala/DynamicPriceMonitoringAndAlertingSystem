package com.satya.app.HTMLFileWorker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableKafka
@ComponentScan
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages="com.satya.app.HTMLFileWorker.dao")
public class HtmlFileWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtmlFileWorkerApplication.class, args);
	}

}
