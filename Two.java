import java.util.Hashtable;

/** Calculates the sum of the even fibonacci numbers whose
 * value does not exceed four million.
 * @author Carlos A. Flores-Arellano.
 * */
public class Two {

    private static Hashtable<Integer, Integer> memo = new Hashtable<>();

    public static void main(String[] args) {
        System.out.println(sumEvenFibs());
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        return memo.get(n);
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
