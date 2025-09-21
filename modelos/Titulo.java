package br.com.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeavaliacao;
    private int duracaoEmMinutos;

    public Titulo(int anoDoLancamento, String nome) {
        this.anoDoLancamento = anoDoLancamento;
        this.nome = nome;
    }

    /// geters e seters metodos acessores

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }  /// o this é por que tem um atributo chamado nome, e um parametro tambem.

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public void setAnoDoLancamento(int anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }
    public int getTotalDeavaliacao() {
        return totalDeavaliacao;
    }
    public void setTotalDeavaliacao(int totalDeavaliacao) {
        this.totalDeavaliacao = totalDeavaliacao;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void info(){
        System.out.println("\n");
        System.out.println("-----------------------------------------");
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano do lançamento: "+ anoDoLancamento);
        System.out.println("Avaliação media: "+ CalcMedia());
        System.out.println("Total de avaliação: "+ totalDeavaliacao);
        System.out.println("Duração em minutos: "+ duracaoEmMinutos);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota; ///somaDasAvaliacoes = somaDasAvaliacoes + nota
        totalDeavaliacao++;        /// armazena a quantidade de vezes que foram a atribuidas as notas
    }
    public double CalcMedia(){
        return somaDasAvaliacoes / totalDeavaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(nome);
    }
}
