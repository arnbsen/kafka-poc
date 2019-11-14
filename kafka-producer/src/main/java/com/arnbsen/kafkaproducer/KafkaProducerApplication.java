package com.arnbsen.kafkaproducer;

import com.arnbsen.models.DemoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication

public class KafkaProducerApplication implements CommandLineRunner {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DemoModel model = new DemoModel();
		model.setId(1);
		model.setDescription("This is a sample Description");
		model.setTopic("Producer");
		this.kafkaTemplate.send("demo", model.toString());
	}

}
