import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
            int[] a = new int[n];
            int[] cnt = new int[110000];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                if (a[i] != 0) cnt[a[i] - 1]++;
                cnt[a[i]]++;
                cnt[a[i] + 1]++;
            }
            int ans = 0;

            for (int i : cnt) {
                ans = Math.max(ans, i);
            }

            // 出力
            out.println(ans);

        }

    }
}

