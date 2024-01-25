package br.com.victor.j0007PolimorfismoHerancaInterface.herdadoConta;


public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
