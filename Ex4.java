/*Resolva o problema da mochila utilizando o algoritmo com programação dinâmica visto em aula, teste e contabilize o número de iterações.

Inteiro backPackPD(Inteiro N, Inteiro C, Tupla<Inteiro, Inteiro> itens)
   N = número de produtos;
   C = capacidade real da mochila
   itens[N +1];   // (O índice 0 guarda null), Tupla com peso e valor
   maxTab[N+1][C+1];

   Inicialize com 0 toda a linha 0 e também a coluna 0;
   para i = 1 até N
      para j = 1 até C
         se item itens[i].peso <= j // se o item cabe na mochila atual
            maxTab[i][j] = Max(maxTab[i-1][j], 
                               itens[i].getValor() + 
                                 maxTab[i-1][j – itens[i].peso]);
         senão
            maxTab[i][j] = maxTab[i-1][j];

   retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e 		         
                        //que pode conter itens que vão do item 1 até o item N. */


import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<ItemMochila> itens = new ArrayList<>();

    //     1) Capacidade: 165

    // Pesos:  23, 31, 29, 44, 53, 38, 63, 85, 89, 82

    // Valores: 92, 57, 49, 68, 60, 43, 67, 84, 87, 72

    //     Blocos selecionados: 1, 2, 3, 4, 6

        itens.add(new ItemMochila(92,23));
        itens.add(new ItemMochila(57,31));
        itens.add(new ItemMochila(49,29));
        itens.add(new ItemMochila(68,44));
        itens.add(new ItemMochila(60,53));
        itens.add(new ItemMochila(43,38));
        itens.add(new ItemMochila(67,63));
        itens.add(new ItemMochila(84,85));
        itens.add(new ItemMochila(87,89));
        itens.add(new ItemMochila(72,82));

        int capacidade = 165;
        int n_itens = 10;

        int result = backPackPD(n_itens, capacidade, itens);
        System.out.println(result);
    }

    public static int backPackPD(int numeroItens, int capacidade, List<ItemMochila> itens) {
        
        int [][] tabela = new int[numeroItens+1][capacidade+1];

        // inicializar linhas com zero
        for(int i=0; i<capacidade+1;i++){
            tabela[0][i] = 0;
        }

        for(int i=0; i<numeroItens+1;i++){
            tabela[i][0] = 0;
        }

        for(int i=1; i<=numeroItens; i++){
            for(int j=1; j<=capacidade; j++){
                if(itens.get(i-1).getPeso() <= j){
                    tabela[i][j] = Math.max(tabela[i-1][j],
                                    itens.get(i-1).getValor() + tabela[i-1][j-itens.get(i-1).getPeso()]);
                }
                else{
                    tabela[i][j] = tabela[i-1][j];
                }
            }
        }
        return tabela[numeroItens][capacidade];
    }
}