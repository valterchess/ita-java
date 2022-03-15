package br.ita.semana1.classes.carros.Main;
import br.ita.semana1.classes.carros.Carro;
public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.potencia = 10;
        carro1.nome = "Vectra";
        carro1.velocidade = 0;

        Carro carro2 = new Carro();

        carro2.potencia = 15;
        carro2.nome = "Batmóvel";
        carro2.velocidade = 0;

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        carro2.acelerar();
        carro2.acelerar();

        carro1.imprimir();
        carro2.imprimir();

    }
}
