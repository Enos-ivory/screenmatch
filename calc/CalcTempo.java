package br.com.screenmatch.calc;


import br.com.screenmatch.modelos.Titulo;

public class CalcTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    /// como o titulo é uma super classe e o filme e serie extenteds titulo, aqui tem varias formas que sao atentendidas ou polimorfismo!

    public void inclui(Titulo t){
        
        this.tempoTotal += t.getDuracaoEmMinutos(); /// tempoTotal = tempoTotal + t.getduracao em minutos >>> forma simplificada
}
     /// sobrecarga de metodos!
     /// public void inclui(Filme f){
     ///    this.tempoTotal += f.getDuracaoEmMinutos(); /// tempoTotal = tempoTotal + f.getduracao em minutos >>> forma simplificada
     ///}
     /// public void inclui(Serie s){
     ///   this.tempoTotal += s.getDuracaoEmMinutos(); /// tempoTotal = tempoTotal + f.getduracao em minutos >>> forma simplificada
     ///}
}
