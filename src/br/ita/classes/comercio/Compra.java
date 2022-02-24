package br.ita.classes.comercio;

public class Compra {
    int valorTotal;
    int numParcelas;

    //a vista

    public Compra(int valorTotal) {
        this.valorTotal = valorTotal;
        numParcelas = 1;
    }

    public Compra(int qtdParcelas, int valorParcela) {
        this.valorTotal = qtdParcelas * valorParcela;
        numParcelas = qtdParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public int getValorParcela(){
       return valorTotal / numParcelas;
    }
}
