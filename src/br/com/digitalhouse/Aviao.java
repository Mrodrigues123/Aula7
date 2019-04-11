package br.com.digitalhouse;

public class Aviao implements Voador{
    private String tipoDeAsa;
    private int quantidadeDeAssentos;

    public Aviao(){}

    public Aviao(int quantidadeDeAssentos, String tipoDeAsa){
        quantidadeDeAssentos = quantidadeDeAssentos;
        tipoDeAsa = tipoDeAsa;
    }

    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoDeAsa) {
        tipoDeAsa = tipoDeAsa;
    }

    public int getquantidadeDeAssentos() {
        return quantidadeDeAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        qtdAssentos = qtdAssentos;
    }


    @Override
    public void voar() {
        System.out.println("Voando como um avião...");

    }
}
