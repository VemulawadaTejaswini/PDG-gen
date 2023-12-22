import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.next();
            }
            int[] cnt = new int[26];
            int[] ans = new int[26];
            Arrays.fill(ans, 100);
            for (int i = 0; i < n; i++) {
                Arrays.fill(cnt, 0);
                for (int j = 0; j < s[i].length(); j++) {
                    cnt[s[i].charAt(j) - 'a']++;
                }
                for (int j = 0; j < 26; j++) {
                    if (cnt[j] == 0) cnt[j] = 0;
                    ans[j] = Math.min(ans[j], cnt[j]);
                }
            }


            // 出力
            for (int i = 0; i < 26; i++) {
                if (ans[i] != 0) {
                    for (int j = 0; j < ans[i]; j++) {
                        out.print(String.valueOf((char) (i + 'a')));
                    }
                }
            }
            out.printf("\n");

        }

    }
}

