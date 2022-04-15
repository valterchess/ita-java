package main.br.ita.semana2.lesson1.pontuacao.classes;

public class CalculadoraBonus {
    private int bonusDoDia = 1;
    public int bonus(Usuario usuario){
        return  (usuario.isVip()) ? (bonusDoDia * 5) : bonusDoDia;
    }

    public int getBonusDoDia() {
        return bonusDoDia;
    }

    public void setBonusDoDia(int bonusDoDia) {
        this.bonusDoDia = bonusDoDia;
    }
}