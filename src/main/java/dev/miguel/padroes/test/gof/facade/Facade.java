package dev.miguel.padroes.test.gof.facade;

import dev.miguel.padroes.test.gof.subsistema1.crm.CrmService;
import dev.miguel.padroes.test.gof.subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
