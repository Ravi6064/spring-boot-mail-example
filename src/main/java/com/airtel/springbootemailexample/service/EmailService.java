package com.airtel.springbootemailexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendEmail() {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("drk6064@gmail.com");
		mail.setSubject("Spring Boot test message");
		mail.setText("This is test body");
		mail.setFrom("test@gmail.com");
		mailSender.send(mail);
	}

}
