/** Returns the longest common subsequence between two strings.
 * */
public class LCS {

    static int lls(String s1, String s2) {
        int[][] memo = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i += 1) {
            for (int j = 0; j < s2.length(); j += 1) {
                memo[i][j] = -1;
            }
        }
        return lls(s1, 0, s2, 0, memo);
    }

    static int lls(String s1, int lo1, String s2, int lo2, int[][] memo) {
        if (lo1 >= s1.length() || lo2 >= s2.length()) {
            return 0;
        }
        if (memo[lo1][lo2] == -1) {
            if (s1.charAt(lo1) == s2.charAt(lo2)) {
                memo[lo1][lo2] = 1 + lls(s1, lo1 + 1, s2, lo2 + 1, memo);
            } else {
                int T = lls(s1, lo1 + 1, s2, lo2, memo);
                int B = lls(s1, lo1, s2, lo2 + 1, memo);
                memo[lo1][lo2] =  Math.max(T, B);
            }
        }
        return memo[lo1][lo2];
    }

    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        System.out.println(lls(s1, s2));
    }
}
