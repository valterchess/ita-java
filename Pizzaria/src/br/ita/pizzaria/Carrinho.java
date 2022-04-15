package main.br.ita.pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pizza> pizzas = new ArrayList<Pizza>();
    private double valorTotal = 0;

    public double getValorTotal() {
        return valorTotal;
    }

    public void addPizzaAoCarrinho(Pizza pizza) {
        if (pizza.getQtdIngredientes() <= 0) {
            System.out.println("Adicione algum ingrediente a pizza!");
        } else {
            System.out.println("Pizza adicionada ao carrinho.");
            pizzas.add(pizza);
            valorTotal += pizza.getPreco();
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "pizzas=" + pizzas +
                ", valorTotal=" + valorTotal +
                '}';
    }
}