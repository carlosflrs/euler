import utils.Primes;

/** Class that prints primes up to ARGS[0].
 */
public class PrintPrimes {

    public static void main (String[] args) {
        printPrimes(Integer.parseInt(args[0]));
    }

    private static void printPrimes(int limit) {
        int np = 0;
        for (int p = 2; p <= limit; p++) {
            if (Primes.isPrime(p)) {
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

}
