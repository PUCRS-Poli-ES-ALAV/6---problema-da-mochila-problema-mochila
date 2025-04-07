/*
    Resolva o problema da mochila utilizando o algoritmo com programação
    dinâmica visto em aula, teste e contabilize o número de iterações.
*/

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
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
        int result = backPackPD(itens.size(), capacidade, itens);
        endTime = System.nanoTime();
        System.out.println("Result Value: " + result);
        System.out.println("Time for Case 1: " + (endTime - startTime) + " ns");
        System.out.println("Quantity of iterations for Case 1: " + contIteracoes);
        System.out.println("Quantity of instructions for Case 1: " + contInstrucoes);

        // Caso de Teste 2
        contIteracoes = 0;
        contInstrucoes = 0;

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
        result = backPackPD(itens.size(), capacidade, itens);
        endTime = System.nanoTime();
        System.out.println("Result Value: " + result);
        System.out.println("Time for Case 2: " + (endTime - startTime) + " ns");
        System.out.println("Quantity of iterations for Case 2: " + contIteracoes);
        System.out.println("Quantity of instructions for Case 2: " + contInstrucoes);
    }

    public static int backPackPD(int numeroItens, int capacidade, List<ItemMochila> itens) {
        contInstrucoes++;
        int[][] tabela = new int[numeroItens + 1][capacidade + 1];
        
        contInstrucoes++;
        for (int i = 0; i < capacidade + 1; i++) {
            contInstrucoes++;
            contIteracoes++;

            tabela[0][i] = 0;
            contInstrucoes++;

            contInstrucoes++;
        }

        contInstrucoes++;
        for (int i = 0; i < numeroItens + 1; i++) {
            contInstrucoes++;
            contIteracoes++;    
            
            tabela[i][0] = 0;
            contInstrucoes++;

            contInstrucoes++;
        }

        // Preenchimento da tabela
        contInstrucoes++;
        for (int i = 1; i <= numeroItens; i++) {
            contInstrucoes++;
            contIteracoes++;

            contInstrucoes++;
            for (int j = 1; j <= capacidade; j++) {
                contInstrucoes++;
                contIteracoes++;

                contInstrucoes++;
                if (itens.get(i - 1).getPeso() <= j) {
                    tabela[i][j] = Math.max(tabela[i - 1][j],
                            itens.get(i - 1).getValor() + tabela[i - 1][j - itens.get(i - 1).getPeso()]);
                    contInstrucoes += 2;
                } else {
                    tabela[i][j] = tabela[i - 1][j];
                    contInstrucoes++;
                }
            }
        }
        contInstrucoes++;
        return tabela[numeroItens][capacidade];
    }
}