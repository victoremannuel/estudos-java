package br.com.victor.j0008Excecoes.herdado;


public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
