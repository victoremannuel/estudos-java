package br.com.victor.j0002OrintacaoObjetos.estudo.screenmatch.modelos;

import br.com.victor.j0002OrintacaoObjetos.estudo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
