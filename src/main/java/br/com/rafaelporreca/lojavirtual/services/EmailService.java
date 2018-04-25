package br.com.rafaelporreca.lojavirtual.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.rafaelporreca.lojavirtual.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);

}
