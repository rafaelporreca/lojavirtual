package br.com.rafaelporreca.lojavirtual.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.rafaelporreca.lojavirtual.services.DBService;
import br.com.rafaelporreca.lojavirtual.services.EmailService;
import br.com.rafaelporreca.lojavirtual.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DBService dbService;
	@Bean
	public boolean instantiateBataBase() throws ParseException {
		
		dbService.instantiateTestDataBase();
		
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
