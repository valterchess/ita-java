package br.ita.crc.logicaresp.banco;

import java.util.List;

public class Banco {
    private List<ContaCorrente> contasAtivas;
    private List<String> numContasAtivas;
    private List<ContaCorrente> contasInativas;
    private double saldoTotal = 0;

    public ContaCorrente criaConta(String titular){
        var conta = new ContaCorrente(titular, Status.ATIVO);
        contasAtivas.add(conta);
        numContasAtivas.add(conta.getNumeroConta());
        return conta;
    }

    public void desativaConta(ContaCorrente conta){
        conta.setStatus(Status.INATIVO);
        contasAtivas.remove(conta);
        numContasAtivas.remove(conta.getNumeroConta());
        contasInativas.add(conta);
    }

    public  void numContas(){
        for (String num: numContasAtivas){
            System.out.printf("Número da conta %d: %s\n",(numContasAtivas.indexOf(num) + 1), num);
        }
    }

    public double saldoTotal(){
        for (ContaCorrente conta : contasAtivas){
            this.saldoTotal += conta.getSaldo();
        }
        return getSaldoTotal();
    }

    private double getSaldoTotal(){
        return this.saldoTotal;
    }
}