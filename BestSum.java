/** A puzzle (by Dan Garcia).
 * - Start a list with an even number of non-negative integers
 * - Each player in turn takes either the leftmost number or the
 *   rightmost number.
 * - Idea is to get the largest possible sum.
 * Example: (6, 12, 0, 8)
 *          Player 1: 8
 *          Player 2: 6
 *          Player 1: 12
 * Player 1 wins with the best sum being 20.
 * */

public class BestSum {

    public static void main (String[] args) {
        int[] V = new int[args.length];
        int i;
        int j;
        for (i = 0; i < args.length; i = i + 1) {
            j = Integer.parseInt(args[i]);
            V[i] = j;
        }
        System.out.println(bestSum(V));
    }

    static int bestSum(int[] V) {
        int total = 0;
        int i;
        for (i = 0;  i < V.length; i = i + 1) {
            total = total + V[i];
        }
        return bestSum(V, 0, V.length - 1, total);
    }

    static int bestSum(int[] V, int low, int high, int total) {
        if (low > high) {
            return 0;
        }
        int takeLeft = total - bestSum(V, low + 1, high, total - V[low]);
        int takeRight = total - bestSum(V, low, high - 1, total - V[high]);
        return Math.max(takeLeft, takeRight);
    }
}
