/** Finds the sum of all the multiples of 3 or 5 below 1000.
 * @author Carlos A. Flore-Arellano.
 * */

public class One {

    public static void main (String[] args) {
        int i;
        int sum;
        sum = 0;
        for (i = 1; i < 1000; i = i + 1) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}
