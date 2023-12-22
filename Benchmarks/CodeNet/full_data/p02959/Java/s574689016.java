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
            int N = Integer.parseInt(in.next());
            int A[] = new int[N + 1];
            int B[] = new int[N];
            for (int i = 0; i < N + 1; i++) {
                A[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(in.next());
            }
            long ans = 0;
            for (int i = 0; i < N; i++) {
                int tmp = Math.min(B[i], A[i]);
                ans += tmp;
                tmp = Math.min(B[i] - tmp, A[i + 1]);
                A[i + 1] -= tmp;
                ans += tmp;
            }

            // 出力
            out.println(ans);

        }

    }
}

