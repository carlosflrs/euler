/** Finds the largest palindrome made from the product of two ARGS[0]-digit
 * numbers.
 * @author Carlos A. Flores-Arellano.
 **/
public class Four {

    public static void main (String[] args) {
        System.out.println(largestPalindrome(Integer.parseInt(args[0])));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    
    private static int largestPalindrome(int limit) {
        int i;
        int j;
        int max = Integer.MIN_VALUE;
        for (i = limit; i > 1; i = i - 1) {
            for (j = limit; j > 1; j = j - 1) {
                if (isPalindrome(String.valueOf(i * j))) {
                    max = Math.max(max, i * j);
                }
            }
        }
        return max;
    }
}
