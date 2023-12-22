import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S));
    }

    private static int solve(String S) {
        int ans = S.length();

        for (int c=0; c<26; c++) {
            char ch = (char)('a'+c);
            if (S.indexOf(String.valueOf(ch)) == -1) continue;

            int longest = 0;
            int idx = -1;
            for (int i=0; i<S.length(); i++) {
                if (S.charAt(i) == ch) {
                    // System.err.println("found at " + i + " val=" + (i-idx-1));
                    longest = Math.max(longest, i - idx - 1);
                    idx = i;
                }
            }
            // System.err.println(ch + " length:" + longest + ", idx=" + idx);
            ans = Math.min(ans, Math.max(longest, S.length()-idx-1));
        }

        return ans;
    }
}