import java.io.IOException;
import java.util.Scanner;

public class LCS {
    static char[] s, t;

    static int[][] memo;
    static boolean[][] vis;

    static int dp(int idxA, int idxB) {
        if(idxA == s.length || idxB == t.length) return 0;
        if(vis[idxA][idxB]) return memo[idxA][idxB];
        int ans = 0;
        if(s[idxA] == t[idxB]) {
            ans = 1 + dp(idxA + 1, idxB + 1);
        } else {
            ans = dp(idxA + 1, idxB);
            ans = Math.max(ans, dp(idxA, idxB + 1));
        }
        vis[idxA][idxB] = true;
        return memo[idxA][idxB] = ans;
    }

    static void trace(int idxA, int idxB) {
        if(idxA == s.length || idxB == t.length) {
            System.out.println();
            return;
        }
        if(s[idxA] == t[idxB]) {
            System.out.print(s[idxA]);
            trace(idxA + 1, idxB + 1);
        } else {
            int ans = dp(idxA, idxB);
            if(ans == dp(idxA + 1, idxB)) {
                trace(idxA + 1, idxB);
            } else {
                trace(idxA, idxB + 1);
            }
        }
    }

    static int solveBottomUp() {
        memo = new int[s.length + 1][t.length + 1];

        for(int i = 0; i <= s.length; i++)
            memo[i][t.length] = 0;
        for(int i = 0; i <= t.length; i++)
            memo[s.length][i] = 0;

        for(int idxA = s.length - 1 ; idxA >= 0; idxA--) {
            for(int idxB = t.length - 1 ; idxB >= 0 ; idxB--) {
                int ans = 0;
                if(s[idxA] == t[idxB]) {
                    ans = 1 + memo[idxA + 1][idxB + 1];
                } else {
                    ans = memo[idxA + 1][idxB];
                    ans = Math.max(ans, memo[idxA][idxB + 1]);
                }
                memo[idxA][idxB] = ans;
            }
        }
        return memo[0][0];
    }

    static int solveTopDown() {
        memo = new int[s.length][t.length];
        vis = new boolean[s.length][t.length];
        return dp(0, 0);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        s = sc.next().toCharArray();
        t = sc.next().toCharArray();
        System.out.println(solveTopDown());
        trace(0, 0);
    }
}
