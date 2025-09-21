package br.com.screenmatch.modelos;

import br.com.screenmatch.calc.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public String diretor;

    public Filme(String nome, int anoDelacamento) {
        super(anoDelacamento, nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)CalcMedia() / 2;
    }
    @Override
    public String toString() {
        return "Filme " + getNome() + "( " + this.getAnoDoLancamento() +" )";
    }
}
