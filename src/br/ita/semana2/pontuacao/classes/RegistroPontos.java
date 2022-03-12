package br.ita.semana2.pontuacao.classes;

public class RegistroPontos {

    private final CalculadoraBonus bonus;
    public RegistroPontos(CalculadoraBonus cB){
        this.bonus = cB;
    }

    public void fazerUmComentario(Usuario usuario){
        usuario.setPontos(usuario.getPontos() + (3 * bonus.bonus(usuario)));
    }
    public void criarUmTopico(Usuario usuario){
        usuario.setPontos(usuario.getPontos() + (5 * bonus.bonus(usuario)));
    }
    public void darLike(Usuario usuario){
        usuario.setPontos(usuario.getPontos() + bonus.bonus(usuario));
    }
}
