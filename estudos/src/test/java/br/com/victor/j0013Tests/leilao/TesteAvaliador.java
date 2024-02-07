package br.com.victor.j0013Tests.leilao;

import br.com.victor.j0013Tests.leilao.dominio.Lance;
import br.com.victor.j0013Tests.leilao.dominio.Leilao;
import br.com.victor.j0013Tests.leilao.dominio.Usuario;
import br.com.victor.j0013Tests.leilao.servico.Avaliador;




public class TesteAvaliador {

    @Test    
    public void testMain() {
        
        //cenario
        Usuario joao = new Usuario("joao");
        Usuario jose = new Usuario("jose");
        Usuario maria = new Usuario("maria");

        Leilao leilao = new Leilao("ps3");

        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(jose, 400.0));
        leilao.propoe(new Lance(maria, 250.0));

        //ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        //validacao
        Double maiorEsperado = 400.0;
        Double menorEsperado = 250.0;

        // Assertions.assertEquals(maiorEsperado, leiloeiro.getMaiorLance());
        System.out.println(leiloeiro.getMaiorLance());
    }
}
