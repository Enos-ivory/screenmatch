package br.com.screenmatch.modelos;

import br.com.screenmatch.calc.Classificavel;

public class Epsodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVews;

    public int getTotalVews() {
        return totalVews;
    }

    public void setTotalVews(int totalVews) {
        this.totalVews = totalVews;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVews > 100) {
            return 4;

        }else return 2;
    }
}