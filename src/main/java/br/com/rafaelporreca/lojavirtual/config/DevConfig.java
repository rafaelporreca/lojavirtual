package br.com.rafaelporreca.lojavirtual.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.rafaelporreca.lojavirtual.services.DBService;
import br.com.rafaelporreca.lojavirtual.services.EmailService;
import br.com.rafaelporreca.lojavirtual.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateBataBase() throws ParseException {
		
		System.out.println("estategia " + strategy);
		
		if(!"create".equals(strategy))
			return false;
		
		dbService.instantiateTestDataBase();
		
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}

}
