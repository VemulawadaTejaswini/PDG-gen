
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author luiscastillo
 */
public class LCS {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int[][] memo = new int[s.length() + 1][t.length() + 1];
        int max = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
                max = Math.max(max, memo[i][j]);
            }
        }

        int i = s.length(), j = t.length();
        while (i > 0 && j > 0) {
            if (s.charAt(i - 1) == t.charAt(j - 1)) {
                result.append(s.charAt(i - 1));
                i--;
                j--;
            } else {
                if (memo[i][j] == memo[i - 1][j]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result.reverse());

    }

}
