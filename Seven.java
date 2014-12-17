import utils.Primes;

/** Finds the ARGS[0]-th prime number.
 * @author Carlos A. Flores-Arellano.
 * */
public class Seven {

    public static void main(String[] args) {
        System.out.println(findPrime(Integer.parseInt(args[0])));
    }

    private static int findPrime(int x) {
       int i;
       int j;
       i = 0;
       j = 1;
       int xThPrime = 0;
       while (j <= x) {
           if (Primes.isPrime(i)) {
               xThPrime = i;
               j = j + 1;
           }
           i = i + 1;
       }
       return xThPrime;
    }
    
}
