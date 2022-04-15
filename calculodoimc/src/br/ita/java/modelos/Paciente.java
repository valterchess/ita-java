package main.br.ita.java.modelos;

public class Paciente {
    private double peso;
    private double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaImc(){
        return (getPeso() / (getAltura() * getAltura());
    }

    public void diagnostico(){
        System.out.printf("IMC = %2.1f\n", calculaImc());
        if (calculaImc() < 16){
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        } else if(calculaImc() < 17 && calculaImc() >= 16){
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        } else if(calculaImc() < 18.5 && calculaImc() >= 17){
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        } else if(calculaImc() < 25 && calculaImc() >= 18.5){
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        } else if(calculaImc() < 30 && calculaImc() >= 25){
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        }  else if(calculaImc() < 35 && calculaImc() >= 30){
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        }  else if(calculaImc() < 40 && calculaImc() >= 35){
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        } else if(calculaImc() >= 40){
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
