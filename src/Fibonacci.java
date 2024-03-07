public class Fibonacci {

    public static void printFibonacci(int qtd) {
        for (int i = 0; i <= qtd; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    private static int fibonacci(int num) {
        if (num <= 1) return num;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
