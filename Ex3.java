
/* 
    Resolva o problema da mochila conforme o enuciado em sala de aula.

    Ache uma solução que testa todas as combinações possíveis e
    seleciona a melhor, aplicando divisão-e-conquista ou não;
    Contabilize o número de iterações;
    Implemente e teste sua solução, para o caso exposto em aula
    e outros de mesmo porte (;-)).
 */

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<ItemMochila> itens = new ArrayList<>();
        itens.add(new ItemMochila(4, 12));
        itens.add(new ItemMochila(2, 1));
        itens.add(new ItemMochila(10, 4));
        itens.add(new ItemMochila(1, 1));
        itens.add(new ItemMochila(2, 2));
        
        int capacidade = 10;

        backpack(itens, capacidade);
    }

    public static void backpack(List<ItemMochila> itens, int capacidade) {
        itens.sort((itemA, itemB) -> Double.compare(
            (itemB.getValor() / itemB.getPeso()),
            (itemA.getValor() / itemA.getPeso()) 
        ));

        itens.forEach(System.out::println);

        double pesoAtual = 0;
        double valorAtual = 0;
        for (ItemMochila item : itens){
            if ((item.getPeso() + pesoAtual) <= capacidade){
                pesoAtual = pesoAtual + item.getPeso();
                valorAtual = valorAtual + item.getValor();
                System.out.println("Item adicionado: " + item.toString() + " PesoAtual: " + pesoAtual + " ValorAtual: " + valorAtual);
            } else {
                break;
            }
        }
    }
}