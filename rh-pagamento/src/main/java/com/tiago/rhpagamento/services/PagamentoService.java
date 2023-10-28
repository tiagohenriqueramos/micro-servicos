package com.tiago.rhpagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tiago.rhpagamento.entities.Pagamento;
import com.tiago.rhpagamento.entities.Trabalhador;

@Service
public class PagamentoService {

	@Value("${rh-trabalhador.host}")
	private String trabalhadorHost;
	
	@Autowired
	private RestTemplate restTemplate;	
	
	public Pagamento getPagamento(long trabalhadorId, int dias) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+trabalhadorId);
		
		Trabalhador trabalhador = restTemplate.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class, uriVariables);
		return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoDia(), dias);
	}
}
