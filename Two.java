/** Calculates the sum of the even fibonacci numbers whose
 * value does not exceed four million.
 * @author Carlos A. Flores-Arellano.
 * */
public class Two {

    public static void main(String[] args) {
        System.out.println(sumEvenFibs());
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int sumEvenFibs() {
        int sum = 0;
        int i = 1;
        int fib = 0;
        while (fib <= 4000000) {
            if (fib % 2 == 0) {
                sum = sum + fib;
            } 
            i = i + 1;
            fib = fibonacci(i);
        }
        return sum;
    }
}
