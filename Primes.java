/** Class that prints primes up to ARGS[0].
 */
public class Primes {

    public static void main (String[] args) {
        printPrimes(Integer.parseInt(args[0]));
    }

    private static void printPrimes(int limit) {
        int np = 0;
        for (int p = 2; p <= limit; p++) {
            if (isPrime(p)) {
                System.out.print(p + " ");
                np++;
                if (np % 10 == 0) {
                    System.out.println();
                }
            }
        }
        if (np % 10 != 0) {
            System.out.println();
        }
    }

    private static boolean isPrime (int x) {
        int limit = (int) (Math.round(Math.sqrt(x) + 1.0));
        if (x <= 1) {
            return false;
        } else {
            return ! isDivisible(x, 2, limit);
        }
    }
    
    private static boolean isDivisible(int x, int k, int lim) {
        if (k >= lim) {
            return false;
        } else if (x % k == 0) {
            return true;
        } else {
            return isDivisible(x, k+1, lim);
        }
    }
}
