/** Finds the sum of all the primes below two million.
 * @author Carlos A. Flores-Arellano.
 * */
public class Ten {

    public static void main(String[] args) {
        System.out.println(sumOfPrimes());
    }
    
    private static boolean isPrime(int x) {
        int limit = (int) (Math.round(Math.sqrt(x) + 1.0));
        if (x <= 1) {
            return false;
        } else {
            return !isDivisible(x, 2, limit);
        }
    }

    private static boolean isDivisible(int x, int k, int lim) {
        if (k >= lim) {
            return false;
        } else if (x % k == 0) {
            return true;
        } else {
            return isDivisible(x, k + 1, lim);
        }
    }

    private static long sumOfPrimes() {
        int i;
        long sum = 0;
        for (i = 2; i < 2000000; i = i + 1) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
