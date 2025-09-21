package br.com.screenmatch.Principal;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O conde de monte cristo ", 2002);
        filme1.avalia(8);
        Filme filme2 = new Filme("dragon boll ", 2017);
        filme2.avalia(9);
        var filmeDoPaulo = new Filme("Dogville ", 2003);
        filmeDoPaulo.avalia(10);
        Serie punisher = new Serie(2016, "The punisher ");

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(punisher);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }
        }
        System.out.println("___________________Busca_por_artistas________________________________");
        ArrayList<String>buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam sandle");
        buscaPorArtistas.add("Bruce dickson");
        buscaPorArtistas.add("Hulk");
        buscaPorArtistas.add("Doutor estranho");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("___________________Busca_por_artistas_arrey_ordenado__________________");
        System.out.println(buscaPorArtistas);
        System.out.println();
        System.out.println("___________________Busca_por_artistas_arrey_ordenado__________________");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("___________________Busca_por_artistas_arrey_ordenado_pelo_ano__________");
        lista.sort(Comparator.comparing(Titulo::getAnoDoLancamento));
        System.out.println(lista);
    }
}