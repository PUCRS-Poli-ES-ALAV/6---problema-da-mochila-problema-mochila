
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
    private static int contIteracoes;
    private static int contInstrucoes;
    public static void main(String[] args) {
        /*
            **Casos de Teste 1**
            Capacidade: **165**
            > Pesos:  23, 31, 29, 44, 53, 38, 63, 85, 89, 82
            > Valores: 92, 57, 49, 68, 60, 43, 67, 84, 87, 72
            Blocos selecionados: 1, 2, 3, 4, 6

            **Casos de Teste 2**
            Capacidade: **190**
            > Pesos:  56, 59, 80, 64, 75, 17
            > Valores: 50, 50, 64, 46, 50, 05
            Blocos selecionados: 1, 2 e 5
        */

        List<ItemMochila> itens;
        int capacidade;

        long startTime;
        long endTime;

        // Caso de Teste 1
        contIteracoes = 0;
        contInstrucoes = 0;

        itens = new ArrayList<>();
        itens.add(new ItemMochila(92, 23));
        itens.add(new ItemMochila(57, 31));
        itens.add(new ItemMochila(49, 29));
        itens.add(new ItemMochila(68, 44));
        itens.add(new ItemMochila(60, 53));
        itens.add(new ItemMochila(43, 38));
        itens.add(new ItemMochila(67, 63));
        itens.add(new ItemMochila(84, 85));
        itens.add(new ItemMochila(87, 89));
        itens.add(new ItemMochila(72, 82));

        capacidade = 165;
        System.out.println("Result for Case 1: ");
        startTime = System.nanoTime();
        backpack(itens, capacidade);
        endTime = System.nanoTime();
        System.out.println("Time for Case 1: " + (endTime - startTime) + " ns");
        System.out.println("Quantity of iteractions for Case 1: " + contIteracoes);
        System.out.println("Quantity of instructions for Case 1: " + contInstrucoes);

        // Caso de Teste 2
        itens = new ArrayList<>();
        itens.add(new ItemMochila(50, 56));
        itens.add(new ItemMochila(50, 59));
        itens.add(new ItemMochila(64, 80));
        itens.add(new ItemMochila(46, 64));
        itens.add(new ItemMochila(50, 75));
        itens.add(new ItemMochila(5, 17));

        capacidade = 190;
        System.out.println("Result for Case 2: ");
        startTime = System.nanoTime();
        backpack(itens, capacidade);
        endTime = System.nanoTime();
        System.out.println("Time for Case 2: " + (endTime - startTime) + " ns");
        System.out.println("Quantity of iteractions for Case 2: " + contIteracoes);
        System.out.println("Quantity of instructions for Case 2: " + contInstrucoes);
    }

    public static void backpack(List<ItemMochila> itens, int capacidade) {
        itens.sort((itemA, itemB) -> Double.compare(
            (itemB.getValor() / itemB.getPeso()),
            (itemA.getValor() / itemA.getPeso()) 
        ));
        contInstrucoes++;

        double pesoAtual = 0;
        double valorAtual = 0;
        contInstrucoes += 2;

        for (ItemMochila item : itens){
            contIteracoes++;
            contInstrucoes++;
            if ((item.getPeso() + pesoAtual) <= capacidade){
                pesoAtual = pesoAtual + item.getPeso();
                valorAtual = valorAtual + item.getValor();
                System.out.println("Added: " + item.toString() + " : Weight: " + pesoAtual + " Value: " + valorAtual);
                contInstrucoes += 3;
            }
        }
    }
}