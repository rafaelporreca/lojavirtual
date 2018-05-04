package br.com.rafaelporreca.lojavirtual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rafaelporreca.lojavirtual.services.S3Service;

@SpringBootApplication
public class LojaVirtualApplication implements CommandLineRunner{
	
	@Autowired
	private S3Service s3Service;
	

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		s3Service.uploadFile("C:\\temp\\havaianas-de-pau.jpg");
		
	}
}
