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
            long k = Long.parseLong(in.next());
            long ans = 0;
            int[] seq = new int[100001];
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                a = Integer.parseInt(in.next());
                b = Integer.parseInt(in.next());
                seq[a] += b;
            }
            for (int i = 1; i <= 100000; i++) {
                if (k <= seq[i]) {
                    ans = i;
                    break;
                }
                k -= seq[i];
            }

            // 出力
            out.println(ans);

        }

    }
}

