package br.com.victor.j0009Lang.banco.especial;

import br.com.victor.j0009Lang.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor; 

	}

}
