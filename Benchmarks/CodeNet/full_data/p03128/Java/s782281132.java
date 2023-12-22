import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMatchMatching solver = new DMatchMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMatchMatching {
        int[] cnt = new int[10];
        int[] memo = new int[10000 + 1];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int M = Integer.parseInt(in.next());
            Arrays.fill(cnt, 1 << 29); // INF
            int[] use = new int[]{1 << 29, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            while (in.hasNext()) {
                int x = Integer.parseInt(in.next());
                cnt[x] = use[x];
            }
            Arrays.fill(memo, -1);
            StringBuilder ans = new StringBuilder();
            while (n > 0) {
                for (int i = 9; i > 0; i--) {
                    if (dfs(n - cnt[i]) + 1 == dfs(n)) {
                        n -= cnt[i];
                        ans.append(i);
                        break;
                    }
                    if (i == 1) return;
                }
            }
            out.println(ans);
        }

        int dfs(int n) {
            if (n < 0) return -2;
            if (n == 0) return 0;
            if (memo[n] == -1) {
                for (int i = 1; i < 10; i++) {
                    memo[n] = Math.max(memo[n], dfs(n - cnt[i]) + 1);
                }
            }
            return memo[n];
        }

    }
}

