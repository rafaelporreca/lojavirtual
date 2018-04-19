package br.com.rafaelporreca.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafaelporreca.lojavirtual.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
}
