import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author naruse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LuckyPIN solver = new LuckyPIN();
        solver.solve(1, in, out);
        out.close();
    }

    static class LuckyPIN {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int cnt[][] = new int[10][n];
            for (int i = 0; i < n; i++) {
                cnt[s.charAt(i) - '0'][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 10; j++) {
                    cnt[j][i] = cnt[j][i] + cnt[j][i - 1];
                }
            }
            long ans = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        for (int l = 1; l < n - 1; l++) {
                            if (s.charAt(l) - '0' != j) continue;
//                        ans += cnt[i][l - 1] * (cnt[k][n - 1] - cnt[k][l]);
                            if (cnt[i][l - 1] * (cnt[k][n - 1] - cnt[k][l]) > 0) {
                                ans++;
                                break;
                            }
                        }
                    }
                }
            }
            out.println(ans);
        }

    }
}

