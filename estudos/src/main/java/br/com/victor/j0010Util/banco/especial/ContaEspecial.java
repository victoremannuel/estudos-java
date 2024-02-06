package br.com.victor.j0010Util.banco.especial;

import br.com.victor.j0010Util.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor; 

	}

}
