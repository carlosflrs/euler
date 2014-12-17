package utils;

/** Calculates if a number is a prime.
 */
public class Primes {

    public static boolean isPrime (int x) {
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
