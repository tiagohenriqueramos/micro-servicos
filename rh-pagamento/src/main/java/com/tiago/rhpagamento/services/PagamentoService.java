package com.tiago.rhpagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.rhpagamento.entities.Pagamento;
import com.tiago.rhpagamento.entities.Trabalhador;
import com.tiago.rhpagamento.feingclients.TrabalhadorFeingClient;

@Service
public class PagamentoService {

	@Autowired
	private TrabalhadorFeingClient trabalhadorFeingClient;
		
	public Pagamento getPagamento(long trabalhadorId, int dias) {

		
		Trabalhador trabalhador = trabalhadorFeingClient.findById(trabalhadorId).getBody();
		return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDia(), dias);
	}
}
