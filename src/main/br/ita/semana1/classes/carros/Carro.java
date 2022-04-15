package main.br.ita.semana1.classes.carros;

public class Carro {
    public int potencia;
    public int velocidade;
    public String nome;
    //Adicionando construtores
    public Carro() {
    }

    public Carro(int potencia){
        this.potencia = potencia;
    }

    public void acelerar(){
        velocidade += potencia;
        System.out.println("");
    }
    public void frear(){
        if (velocidade > 0){
            velocidade /= 2;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void imprimir(){
        System.out.printf("O carro %s está à %d km por hora\n", nome, getVelocidade());
    }
}
