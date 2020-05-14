package com.airtel.springbootemailexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.springbootemailexample.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/email")
	public String sendEmail() {
		emailService.sendEmail();
		return "Successfully Sent";
	}

}
