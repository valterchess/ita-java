package main.br.ita.pizzaria;
import static main.br.ita.pizzaria.Pizza.qtdIngredientesUsados;

public class Principal {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();
        Carrinho carrinho = new Carrinho();

        pizza1.adicionaIngrediente("Frango");
        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Palmito");
        pizza1.adicionaIngrediente("Peperoni");
        pizza1.adicionaIngrediente("Escarola");
        pizza2.adicionaIngrediente("Calabresa");
        pizza2.adicionaIngrediente("Atum");

        pizza2.adicionaIngrediente("Mussarela");
        pizza2.adicionaIngrediente("Calabresa");
        pizza2.adicionaIngrediente("Peperoni");

        pizza3.adicionaIngrediente("Palmito");
        pizza3.adicionaIngrediente("Camarão");
        pizza3.adicionaIngrediente("Atum");

        carrinho.addPizzaAoCarrinho(pizza1);
        carrinho.addPizzaAoCarrinho(pizza2);
        carrinho.addPizzaAoCarrinho(pizza3);

        System.out.println("Valor total: " + carrinho.getValorTotal());

        qtdIngredientesUsados();
    }
}
