import utils.Primes;

/** Finds the smalles positive number that is evenly divisible by all
 * of the numbers from 1 to ARGS[0].
 * @author Carlso A. Flores-Arellano.
 * */
public class Five {

    public static void main(String[] args) {
        System.out.println(findSmallest(Integer.parseInt(args[0])));
    }

    private static int findSmallest(int x) {
        int i;
        i = 1;
        while (!evenlyDivisible(i, x)) {
            i = i + 1;
        }
        return i;
    }

    private static boolean evenlyDivisible(int n, int bound) {
        int i;
        int ceiling = (int) Math.sqrt(n);
        for (i = 2; i <= bound; i = i + 1) {
            if (n % i != 0 || i >= ceiling) {
                return false;
            }
        }
        return true;
    }
}
