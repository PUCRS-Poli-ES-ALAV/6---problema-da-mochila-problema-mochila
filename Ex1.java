// implemente os algortimos;
// teste todos para os inteiros 4, 8, 16, 32;
// teste os dois últimos também para os inteiro 128, 1000 e 10.000.

public class Ex1 {
    private static int contInstrucoes;
    private static int contIteracoes;

    public static void main(String[] args) {

        contInstrucoes = 0;
        contIteracoes = 0;

        int[] testCases1 = {4, 8, 16, 32};
        int[] testCases2 = {4, 8, 16, 32, 128, 1000, 10000};
        int[] testCases3 = {4, 8, 16, 32, 128, 1000};

        System.out.println("------------ fiboRec ------------");

        for(int numero : testCases1){
            long startTime = System.nanoTime();
            int resultado = fiboRec(numero);
            long estimatedTime = System.nanoTime() - startTime;

            System.out.println("Result for number "+ numero +": "+ resultado);
            System.out.println("Time for number "+ numero +": "+estimatedTime+" ns");
            System.out.println("Quantity of instructions for number "+ numero +": "+contInstrucoes);
            System.out.println("Quantitity of iterations for number "+ numero +": "+contIteracoes);
            System.out.println();

            contInstrucoes = 0; 
            contIteracoes = 0;
        }

        System.out.println("------------ fibo ------------");

        for(int numero : testCases2){
            long startTime = System.nanoTime();
            int resultado = fibo(numero);
            long estimatedTime = System.nanoTime() - startTime;

            System.out.println("Result for number "+ numero +": "+ resultado);
            System.out.println("Time for number "+ numero +": "+estimatedTime+" ns");
            System.out.println("Quantity of instructions for number "+ numero +": "+contInstrucoes);
            System.out.println("Quantitity of iterations for number "+ numero +": "+contIteracoes);
            System.out.println();

            contInstrucoes = 0; 
            contIteracoes = 0;
        }

        System.out.println("------------ memoizedFibo & lookupFibo ------------");

        for(int numero : testCases3){
            int[] f = new int[numero+1];

            long startTime = System.nanoTime();
            int resultado = memoizedFibo(f, numero);
            long estimatedTime = System.nanoTime() - startTime;

            System.out.println("Result for number "+ numero +": "+ resultado);
            System.out.println("Time for number "+ numero +": "+estimatedTime+" ns");
            System.out.println("Quantity of instructions for number "+ numero +": "+contInstrucoes);
            System.out.println("Quantitity of iterations for number "+ numero +": "+contIteracoes);
            System.out.println();

            contInstrucoes = 0; 
            contIteracoes = 0;
        }
    }

    public static int fiboRec(int n){
        contIteracoes++;

        contInstrucoes++;
        if(n <= 1){
            contInstrucoes++;
            return n;
        } else {
            int a = fiboRec(n-1); 
            int b = fiboRec(n-2);
            contInstrucoes += 2;

            contInstrucoes++;
            return a + b;
        }
    }

    public static int fibo(int n){
        contIteracoes++;

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        contInstrucoes += 3;

        contInstrucoes++; // i = 2
        for(int i = 2; i <= n; i++){
            contInstrucoes++; // i <= n

            f[i] = f[i-1] + f[i-2];
            contInstrucoes += 2; // = e +
            contInstrucoes++; // i++
        }
        contInstrucoes++;
        return f[n];
    }

    public static int memoizedFibo(int[] f, int n){
        contIteracoes++;

        contInstrucoes++; // i = 0
        for(int i = 0; i<=n; i++){
            contInstrucoes++; // i <= n

            contInstrucoes++;
            f[i] = -1;

            contInstrucoes++; // i++
        }
        contInstrucoes++;
        return lookupFibo(f, n);
    }

    public static int lookupFibo(int[] f, int n){
        contIteracoes++;

        contInstrucoes++;
        if(f[n] >= 0){
            contInstrucoes++;
            return f[n];
        }
        contInstrucoes++;
        if(n <= 1){
            contInstrucoes++;
            f[n] = n;
        }
        else{
            contInstrucoes++;
            f[n] = lookupFibo(f, n-1) + lookupFibo(f, n-2);
        }
        contInstrucoes++;
        return f[n];
    }
}
