/** Finds the difference between the sum of the squares of the first
 * ARGS[0] natural numbers and the square of the sum.
 * @author Carlos A. Flores-Arellano.
 **/
public class Six {

    public static void main(String[] args) {
        System.out.println(difference(Integer.parseInt(args[0])));
    }
    private static int sumOfSquares(int x) {
        int i;
        int sum = 0;
        for (i = 1; i <= x; i = i + 1) {
            sum = sum + (i * i);
        }
        return sum;
    }

    private static int squareOfSum(int x) {
        int sum;
        sum = (x * (x + 1)) / 2;
        return sum * sum;
    }

    private static int difference(int x) {
        return squareOfSum(x) - sumOfSquares(x);
    }
}
