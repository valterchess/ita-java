package main.br.ita.crc.logicaresp.banco;

public class ContaCorrente {
    private static int numeroContas = 1;
    private final String numeroConta;
    private final String titular;
    private double saldo;
    private Status status;

    {
        numeroConta = (numeroContas) + " " + String.format("%5.1f", Math.random() * 9999);
        numeroContas++;
    }

    public ContaCorrente(String titular, Status status) {
        this.titular = titular;
        this.status = status;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        if (valor >= 10) {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso.");
            System.out.printf("Saldo atual: %f", getSaldo());
        }
        else System.err.println("O valor mínimo para depósito é de 10R$");
    }

    public void saca(double valor){
        if (valor > 0 && getSaldo() >= valor){
            this.saldo -= valor;
            System.out.println("Saque autorizado! retire o valor");
        }
    }

    public void setStatus(Status inativo) {
        this.status = inativo;
    }

    public Status getStatus() {
        return status;
    }
}