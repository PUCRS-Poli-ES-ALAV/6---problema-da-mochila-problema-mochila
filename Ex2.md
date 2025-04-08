
<!--
    Resolva o problema da mochila conforme o enuciado em sala de aula.
    Monte uma tabela com a contabilização das execuções anteriores (número de iterações e número de instruções)
    e com os resultados das execuções. As linhas da tabela são os
    algoritmos implementados, as colunas os valores para testar e contabilizar.
-->

# Tabela de Fibonacci

## Resultados

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | 3 | 21 | 987 | 2178309 | - | - | - |
| Iterativo | 3 | 21 | 987 | 2178309 | -1361106235 | 1556111435 | 1242044891 |
| Memoized | 3 | 21 | 987 | 2178309 | -1361106235 | 1556111435 | Estouro de pilha |

## Iterações

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | 9 | 67 | 3193 | 7049155 | - | - | - |
| Iterativo | 3 | 7 | 15 | 31 | 127 | 999 | 9999 |
| Memoized | 12 | 24 | 48 | 96 | 774 | 15266 | Estouro de pilha |


## Instruções

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | 26 | 200 | 9578 | 21147464 | - | - | - |
| Iterativo | 17 | 33 | 65 | 129 | 513 | 4001 | 40001 |
| Memoized | 41 | 77 | 149 | 293 | 2327 | 45803 | Estouro de pilha |

## Tempo (ns)

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | 2826 | 9558 | 222975 | 15385146 | - | - | - |
| Iterativo | 5982 | 2294 | 3116 | 5059 | 15128 | 117609 | 968368 |
| Memoized | 8306 | 4478 | 7774 | 2178309 | 134821 | 799944 | Estouro de pilha |

------------ fiboRec ------------
Result for number 4: 3
Time for number 4: 3416 ns
Quantity of instructions for number 4: 26
Quantitity of iterations for number 4: 9

Result for number 8: 21
Time for number 8: 10470 ns
Quantity of instructions for number 8: 200
Quantitity of iterations for number 8: 67

Result for number 16: 987
Time for number 16: 507057 ns
Quantity of instructions for number 16: 9578
Quantitity of iterations for number 16: 3193

Result for number 32: 2178309
Time for number 32: 20111089 ns
Quantity of instructions for number 32: 21147464
Quantitity of iterations for number 32: 7049155

------------ fibo ------------
Result for number 4: 3
Time for number 4: 6222 ns
Quantity of instructions for number 4: 17
Quantitity of iterations for number 4: 3

Result for number 8: 21
Time for number 8: 2735 ns
Quantity of instructions for number 8: 33
Quantitity of iterations for number 8: 7

Result for number 16: 987
Time for number 16: 3877 ns
Quantity of instructions for number 16: 65
Quantitity of iterations for number 16: 15

Result for number 32: 2178309
Time for number 32: 6292 ns
Quantity of instructions for number 32: 129
Quantitity of iterations for number 32: 31

Result for number 128: -292077259460760891
Time for number 128: 20058 ns
Quantity of instructions for number 128: 513
Quantitity of iterations for number 128: 127

Result for number 1000: 817770325994397771
Time for number 1000: 149278 ns
Quantity of instructions for number 1000: 4001
Quantitity of iterations for number 1000: 999

Result for number 10000: -2872092127636481573
Time for number 10000: 1031185 ns
Quantity of instructions for number 10000: 40001
Quantitity of iterations for number 10000: 9999

------------ memoizedFibo & lookupFibo ------------
Result for number 4: 3
Time for number 4: 9107 ns
Quantity of instructions for number 4: 41
Quantitity of iterations for number 4: 12

Result for number 8: 21
Time for number 8: 5059 ns
Quantity of instructions for number 8: 77
Quantitity of iterations for number 8: 24

Result for number 16: 987
Time for number 16: 8746 ns
Quantity of instructions for number 16: 149
Quantitity of iterations for number 16: 48

Result for number 32: 2178309
Time for number 32: 17002 ns
Quantity of instructions for number 32: 293
Quantitity of iterations for number 32: 96

Result for number 128: -292077259460760891
Time for number 128: 108262 ns
Quantity of instructions for number 128: 1523
Quantitity of iterations for number 128: 506

Result for number 1000: 817770325994397771
Time for number 1000: 2451076 ns
Quantity of instructions for number 1000: 61361
Quantitity of iterations for number 1000: 20452