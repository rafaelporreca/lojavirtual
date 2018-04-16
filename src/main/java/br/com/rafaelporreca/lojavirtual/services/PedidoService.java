package br.com.rafaelporreca.lojavirtual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelporreca.lojavirtual.domain.Pedido;
import br.com.rafaelporreca.lojavirtual.repositories.PedidoRepository;
import br.com.rafaelporreca.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id){
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}

}
