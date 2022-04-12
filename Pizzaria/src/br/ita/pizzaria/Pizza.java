package br.ita.pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    private double preco;
    private int qtdIngredientes = 0; // quantidade de ingredientes adicionados a pizza
    private List<String> ingredientesAdicionados = new ArrayList<>(); // lista de ingredientes adicionados a pizza

    // total de ingredientes e quantidade de cada um
    private static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>() {{
        put("mussarela", 30);
        put("frango", 30);
        put("calabresa", 30);
        put("palmito", 30);
        put("camarão", 30);
        put("escarola", 30);
        put("peperoni", 30);
        put("atum", 30);
    }};

    public static void qtdIngredientesUsados() {
        ingredientes.forEach((ingr, qtd) -> {
            System.out.println("Foram utilizados " + (30 - qtd) + " unidades de " + ingr);
        });
    }

    // ingredientes que estão com o estoque 'zerado'
    private static HashMap<String, Integer> ingredientesEmFalta = new HashMap<>() {
        {
            ingredientes.forEach((s, integer) -> {
                if (ingredientes.get(s) <= 0) {
                    put(s, integer);
                }
            });
        }
    };

    // bloco de execução que retorna todos os ingredientes que ainda não estão em falta
    static {
        System.out.println("sabores de pizzas disponíveis: ");
        ingredientes.forEach((s, integer) -> {
            if (!ingredientesEmFalta.containsKey(s)) {
                System.out.println(s);
            }
        });
    }

    // Adiciona um ingrediente a pizza se estiver disponível
    public void adicionaIngrediente(String ingrediente) {
        qtdIngredientes += (faltaIngrediente(ingrediente))
                ? indisponivel(ingrediente)
                : adiciona(ingrediente);
    }

    public double getPreco() {
        determinaValor();
        return preco;
    }

    public int getQtdIngredientes() {
        return qtdIngredientes;
    }

    public void ingredientesAdicionados() { // não coloquei um get porque os valores da lista não serão utilizados para nenhuma operação
        ingredientesAdicionados.forEach(System.out::println);
    }

    private static boolean faltaIngrediente(String ingrediente) {
        ingrediente = ingrediente.toLowerCase();
        return (ingredientesEmFalta.containsKey(ingrediente)
                || !ingredientes.containsKey(ingrediente)); // Ou se... A lista não contem ingrediente
    }


    private Integer indisponivel(String ingrediente) {
        System.out.printf("%s em falta\n", ingrediente);
        return 0;
    }

    private static void contabilizaIngrediente(String ingrediente) {
        Integer valor = ingredientes.get(ingrediente) - 1;
        ingredientes.put(ingrediente, valor); // atualiza a quantidade de ingredientes
    }

    private Integer adiciona(String ingrediente) {
        if (ingredientesAdicionados.contains(ingrediente)) {
            System.out.printf("%s já adicionado a pizza. \n", ingrediente);
            return 0;
        } else {
            ingredientesAdicionados.add(ingrediente);
            ingrediente = ingrediente.toLowerCase();
            System.out.printf("%s adicionado a pizza, ", ingrediente);
            contabilizaIngrediente(ingrediente);  // recebe o valor da quantidade do ingrediente - 1
            return 1;
        }
    }

    private void determinaValor() {
        qtdIngredientes = ingredientesAdicionados.size();
        this.preco = (this.qtdIngredientes > 5) ? 23.0 : switch (this.qtdIngredientes) {
            case 1, 2 -> 15.0;
            case 3, 4, 5 -> 20.0;
            default -> 23.0;
        };
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "preco=" + preco +
                "qtdIngredinetes="+ qtdIngredientes +
                '}';
    }
}