/** Finds the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 * @author Carlos A. Flores-Arellano.
 **/
public class Six {

    public static void main(String[] args) {
        System.out.println(difference());
    }
    private static int sumOfSquares() {
        int i;
        int sum = 0;
        for (i = 1; i <= 100; i = i + 1) {
            sum = sum + (i * i);
        }
        return sum;
    }

    private static int squareOfSum() {
        int sum;
        sum = (100 * 101) / 2;
        return sum * sum;
    }

    private static int difference() {
        return squareOfSum() - sumOfSquares();
    }
}
