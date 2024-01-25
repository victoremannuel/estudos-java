package br.com.victor.j0002OrintacaoObjetos.estudo.br.com.alura.screenmatch.modelos;

import br.com.victor.j0002OrintacaoObjetos.estudo.br.com.alura.screenmatch.calculos.Classificavel;

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
