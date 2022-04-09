package br.ita.semana2.lesson1.pontuacao.test;
import br.ita.semana2.lesson1.pontuacao.classes.CalculadoraBonus;
import br.ita.semana2.lesson1.pontuacao.classes.RegistroPontos;
import br.ita.semana2.lesson1.pontuacao.classes.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRegistroDePontos {
    @Test
    public void pontosCriarTopico(){
        Usuario usuario = new Usuario();
        usuario.setNome("Silva");
        CalculadoraBonus bonus = new CalculadoraBonus();
        RegistroPontos pontos = new RegistroPontos(bonus);
        pontos.criarUmTopico(usuario);
        assertEquals(usuario.getPontos(), 5);
    }
    @Test
    public void pontosCriarTopicoVIP(){
        Usuario usuario = new Usuario();
        usuario.setNome("Silva");
        usuario.setVip(true);
        CalculadoraBonus bonus = new CalculadoraBonus();
        RegistroPontos pontos = new RegistroPontos(bonus);
        pontos.criarUmTopico(usuario);
        assertEquals(usuario.getPontos(), 25);
    }
    @Test
    public void pontosCriarTopicoBonusDoDia(){
        Usuario usuario = new Usuario();
        usuario.setNome("Silva");
        CalculadoraBonus bonus = new CalculadoraBonus();
        bonus.setBonusDoDia(3);
        RegistroPontos pontos = new RegistroPontos(bonus);
        pontos.criarUmTopico(usuario);
        assertEquals(usuario.getPontos(), 15);
    }
    @Test
    public void pontosCriarTopicoVipBonusdoDia(){
        Usuario usuario = new Usuario();
        usuario.setNome("Silva");
        usuario.setVip(true);
        CalculadoraBonus bonus = new CalculadoraBonus();
        bonus.setBonusDoDia(2);
        RegistroPontos pontos = new RegistroPontos(bonus);
        pontos.criarUmTopico(usuario);
        assertEquals(usuario.getPontos(), 50);
    }
}
