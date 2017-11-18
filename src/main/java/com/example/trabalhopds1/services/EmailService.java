package com.example.trabalhopds1.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.trabalhopds1.domain.Cliente;
import com.example.trabalhopds1.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
