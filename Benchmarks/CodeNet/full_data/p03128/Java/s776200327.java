import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int[] match = { -1, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer[] A = new Integer[M];
        for (int i = 0; i < M; ++i) A[i] = sc.nextInt();
        Arrays.sort(A, Collections.reverseOrder());

        String[] dp = new String[100100];
        for (int i = 0; i < 100100; ++i) dp[i] = "";
        for (int i = 0; i < N; ++i) {
            for (int a : A) {
                if (i == 0 || dp[i] != "") {
                    String p = dp[i + match[a]];
                    String q = dp[i] + a;
                    if (p.length() < q.length() || p.length() == q.length() && p.compareTo(q) > 0) {
                        dp[i + match[a]] = dp[i] + a;
                    }
                }
            }
        }
        for (int i = dp[N].length() - 1; i >= 0; --i) System.out.print(dp[N].charAt(i));
        System.out.println();
    }
}
