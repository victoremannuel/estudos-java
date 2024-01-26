package br.com.victor.j0008Excecoes.herdado;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
 @Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}	

}
