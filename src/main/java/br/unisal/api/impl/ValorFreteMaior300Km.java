package br.unisal.api.impl;

import br.unisal.api.interfaces.RegraDeCalculo;
import br.unisal.api.model.Frete;

public class ValorFreteMaior300Km implements RegraDeCalculo{

	@Override
	public double calcula(Frete frete) {
		double retorno = 0;
		if(frete.getDistancia() > 300)
			retorno = frete.getDistancia() * 1.75;
		return retorno;
	}
}
