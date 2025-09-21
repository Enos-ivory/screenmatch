package br.com.screenmatch.modelos;
public class Serie extends Titulo{
    ///atributos
    private int temporadas;
    private int epPorTemporadas;
    private boolean ativa;
    private int minPorEpsodios;

    public Serie(int anoDoLancamento, String nome) {
        super(anoDoLancamento, nome);
    }

    ///metodos geters e seters

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporadas() {
        return epPorTemporadas;
    }

    public void setEpPorTemporadas(int epPorTemporadas) {
        this.epPorTemporadas = epPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinPorEpsodios() {
        return minPorEpsodios;
    }

    public void setMinPorEpsodios(int minPorEpsodios) {
        this.minPorEpsodios = minPorEpsodios;
    }
    ///a anotacao é uma boa pratica e é opcional sem ela o metodo ainda funciona
    /// aqui tambem é uma forma de polimorfismo, pois adciona dentro da classe uma
    /// nova funcionalidade no metodo herdado do titulo!
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * minPorEpsodios * epPorTemporadas;
    }
    @Override
    public String toString() {
        return "Serie " + getNome() + "( " + this.getAnoDoLancamento() +" )";
    }


    public void infoSerie() {
        System.out.println("\n");
        System.out.println("-----------------------------------------");
        System.out.println("Nome da serie: "+ getNome());
        System.out.println("Ano do lançamento: "+ getAnoDoLancamento());
        System.out.println("Avaliação: "+ String.format("%.2f",getSomaDasAvaliacoes() / getTotalDeavaliacao()));
        System.out.println("Total de avaliação: "+ getTotalDeavaliacao());
        System.out.println("Duração em minutos: "+ getDuracaoEmMinutos());;
    }
}

