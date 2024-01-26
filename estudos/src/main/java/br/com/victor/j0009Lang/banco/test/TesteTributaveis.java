package br.com.victor.j0009Lang.banco.test;

import br.com.victor.j0009Lang.banco.modelo.CalculadorDeImposto;
import br.com.victor.j0009Lang.banco.modelo.ContaCorrente;
import br.com.victor.j0009Lang.banco.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
