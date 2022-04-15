package test;

import main.br.ita.semana1.classes.carros.Carro;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCarro {
    @Test
    public void testCarroParado(){
        Carro carro = new Carro();
        assertEquals(0, carro.getVelocidade());
    }

    @Test
    public  void testAcelerar(){
        Carro carro = new Carro();
        carro.potencia = 10;
        carro.acelerar();
        assertEquals(10, carro.getVelocidade());
    }

    @Test
    public void testFrear(){
        Carro carro = new Carro();
        carro.potencia = 10;
        carro.acelerar();
        carro.frear();
        assertEquals(5, carro.getVelocidade());
    }

}
