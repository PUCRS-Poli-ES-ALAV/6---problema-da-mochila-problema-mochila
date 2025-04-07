
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
| Recursivo | X | X | X | X | X | - | - |
| Iterativo | X | X | X | X | X | X | X |
| Memoized | X | X | X | X | X | X | X |

## Iterações

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | X | X | X | X | X | - | - |
| Iterativo | X | X | X | X | X | X | X |
| Memoized | X | X | X | X | X | X | X |

## Instruções

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | X | X | X | X | X | - | - |
| Iterativo | X | X | X | X | X | X | X |
| Memoized | X | X | X | X | X | X | X |

## Tempo (ns)

| Fibonacci | 4 | 8 | 16 | 32 | 128 | 1000 | 10000
|-|-|-|-|-|-|-|-|
| Recursivo | X | X | X | X | X | - | - |
| Iterativo | X | X | X | X | X | X | X |
| Memoized | X | X | X | X | X | X | X |

------------ fiboRec ------------
Result for number 4: 3
Time for number 4: 3086 ns
Quantity of instructions for number 4: 26
Quantitity of iterations for number 4: 9

Result for number 8: 21
Time for number 8: 10540 ns
Quantity of instructions for number 8: 200
Quantitity of iterations for number 8: 67

Result for number 16: 987
Time for number 16: 513177 ns
Quantity of instructions for number 16: 9578
Quantitity of iterations for number 16: 3193

Result for number 32: 2178309
Time for number 32: 19535539 ns
Quantity of instructions for number 32: 21147464
Quantitity of iterations for number 32: 7049155

------------ fibo ------------
Result for number 4: 3
Time for number 4: 6292 ns
Quantity of instructions for number 4: 17
Quantitity of iterations for number 4: 1

Result for number 8: 21
Time for number 8: 2374 ns
Quantity of instructions for number 8: 33
Quantitity of iterations for number 8: 1

Result for number 16: 987
Time for number 16: 2826 ns
Quantity of instructions for number 16: 65
Quantitity of iterations for number 16: 1

Result for number 32: 2178309
Time for number 32: 4449 ns
Quantity of instructions for number 32: 129
Quantitity of iterations for number 32: 1

Result for number 128: -1361106235
Time for number 128: 13204 ns
Quantity of instructions for number 128: 513
Quantitity of iterations for number 128: 1

Result for number 1000: 1556111435
Time for number 1000: 99806 ns
Quantity of instructions for number 1000: 4001
Quantitity of iterations for number 1000: 1

Result for number 10000: 1242044891
Time for number 10000: 830609 ns
Quantity of instructions for number 10000: 40001
Quantitity of iterations for number 10000: 1

------------ memoizedFibo & lookupFibo ------------
Result for number 4: 3
Time for number 4: 8506 ns
Quantity of instructions for number 4: 41
Quantitity of iterations for number 4: 8

Result for number 8: 21
Time for number 8: 4339 ns
Quantity of instructions for number 8: 77
Quantitity of iterations for number 8: 16

Result for number 16: 987
Time for number 16: 7564 ns
Quantity of instructions for number 16: 149
Quantitity of iterations for number 16: 32

Result for number 32: 2178309
Time for number 32: 15549 ns
Quantity of instructions for number 32: 293
Quantitity of iterations for number 32: 64

Result for number 128: -1361106235
Time for number 128: 154057 ns
Quantity of instructions for number 128: 2327
Quantitity of iterations for number 128: 646

Result for number 1000: 1556111435
Time for number 1000: 844776 ns
Quantity of instructions for number 1000: 45803
Quantitity of iterations for number 1000: 14266