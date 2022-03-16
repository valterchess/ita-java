package br.ita.semana2.funcoesparametodos.Escola;

public class Aluno {
    int bim1, bim2, bim3, bim4;

        public int media(){
            int total = bim1 + bim2 + bim3 + bim4;
            return total / 4;
        }

    public boolean passouDeAno(){
        return (media() >= 60);
    }
}
