package utils;

import java.util.ArrayList;

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

    public static ArrayList<Integer> primeFactors(int x) {
        ArrayList<Integer> primes = new ArrayList<>();
        int i;
        for (i = 2; i <= x; i = i + 1) {
            if (isPrime(i) && x % i == 0) {
                primes.add(i);
                x = x / i;
                i = i - 1;
            }
        }
        return primes;
    }

}
