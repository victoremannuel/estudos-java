package br.com.victor.j0008Excecoes.pilha;


public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento ....");
		}
	
	}

}
