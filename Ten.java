import utils.Primes;

/** Finds the sum of all the primes below ARGS[0].
 * @author Carlos A. Flores-Arellano.
 * */
public class Ten {

    public static void main(String[] args) {
        System.out.println(sumOfPrimes(Integer.parseInt(args[0])));
    }
    
    private static long sumOfPrimes(int p) {
        int i;
        long sum = 0;
        for (i = 2; i < p; i = i + 1) {
            if (Primes.isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
