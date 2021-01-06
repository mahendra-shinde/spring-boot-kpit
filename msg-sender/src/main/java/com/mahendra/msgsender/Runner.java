package com.mahendra.msgsender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;
	
	public Runner(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter message (enter NO to stop): ");
		Scanner sc = new Scanner(System.in);
		
		String message = sc.nextLine();
		while(!message.equalsIgnoreCase("NO")) {
			System.out.println("Sending message...");
			rabbitTemplate.convertAndSend(SampleApp1Application.topicExchangeName, "foo.bar.baz", message);
			message = sc.nextLine();
		}
		return;
	}

}