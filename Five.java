import utils.Primes;

import java.util.ArrayList;
import java.util.Hashtable;

/** Finds the smallest positive number that is evenly divisible by all
 * of the numbers from 1 to ARGS[0].
 * @author Carlso A. Flores-Arellano.
 * */
public class Five {

    public static void main(String[] args) {
        System.out.println(findSmallest(Integer.parseInt(args[0])));
    }

    private static long findSmallest(int n) {
        int[] freq = highestFrequencies(n);
        int i;
        long total = 1;
        for (i = 1; i < freq.length; i = i + 1) {
            if (freq[i] != 0) {
                total = total * ((long) Math.pow(i, freq[i]));
            }
        }
        return total;
    }

    private static int[] highestFrequencies(int n) {
        int[] frequencies = new int[n + 1];
        int[] prime = new int[2];
        int i = 1;
        for (i = 1; i <= n; i = i + 1) {
            prime = highestFactor(i);
            if (frequencies[prime[0]] < prime[1]) {
                frequencies[prime[0]] = prime[1];
            }
        }
        return frequencies;
    }

    private static int[] highestFactor(int n) {
        ArrayList<Integer> factors = Primes.primeFactors(n);
        int[] frequency = new int[n + 1];
        int[] rtn = new int[2];
        int i;
        int max = 0;
        int freq;
        for (i = 0; i < factors.size(); i = i + 1) {
            frequency[factors.get(i)] += 1;
            freq = frequency[factors.get(i)];
            if (freq > max) {
                max = freq;
                rtn[0] = factors.get(i);
                rtn[1] = max;
            }
        }
        return rtn;
    }

}
