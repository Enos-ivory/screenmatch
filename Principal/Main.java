package br.com.screenmatch.Principal;
import br.com.screenmatch.calc.CalcTempo;
import br.com.screenmatch.calc.FiltroRecomendacao;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Serie punisher = new Serie(2016,"The punisher");
        punisher.setNome("the punisher");
        punisher.setAnoDoLancamento(2016);
        punisher.avalia(8);punisher.avalia(5.9);punisher.avalia(7);
        punisher.setMinPorEpsodios(60);
        punisher.setEpPorTemporadas(2);
        punisher.setTemporadas(2);
        punisher.infoSerie();
        System.out.println("duracao em minutos para maratonar the punisher: "+punisher.getDuracaoEmMinutos());

        /// criacao de um objeto a partir da classe br.com.screenmatch.modelos.Filme, e guardado na variavel filme1

        Filme filme1 = new Filme("O conde de monte cristo",2002);
        ///atributos
       // filme1.setNome("O conde de monte cristo");
        filme1.setDuracaoEmMinutos(131);
       // filme1.setAnoDoLancamento(2002);
        filme1.avalia(8);
        filme1.avalia(8);
        filme1.avalia(8);
        filme1.avalia(8);
        filme1.info();
        System.out.println("Media das avaliações: "+ filme1.getNome() +" é " +String.format("%.2f",filme1.
                CalcMedia()));
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Filme filme2 = new Filme("dragon boll",2017);
        //filme2.setNome("dragon boll");
        filme2.setDuracaoEmMinutos(70);
        filme2.setDuracaoEmMinutos(190);
        //filme2.setAnoDoLancamento(2017);


        CalcTempo calc = new CalcTempo();
        calc.inclui(filme1);
        calc.inclui(filme2);
        calc.inclui(punisher);
        System.out.println("tempo em minutos "+ calc.getTempoTotal()+" < minutos");

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        
        filmeDoPaulo.avalia(9);

        /// craiando um array de objetos e adicionado objetos

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(listaDeFilmes);
        System.out.println("Tamanho da lista de filmes "+ listaDeFilmes.size());
        System.out.println("Exibindo o toString "+ listaDeFilmes.get(0).toString());
        System.out.println("Exibindo o Primeiro filme " + listaDeFilmes.get(0).getNome());

    }
}
