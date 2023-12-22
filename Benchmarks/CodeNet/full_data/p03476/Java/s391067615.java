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
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private static final int N = 100010;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            boolean[] prime = new boolean[N];
            Arrays.fill(prime, true);
            prime[0] = prime[1] = false;
            for (int i = 2; i < N; ++i) {
                if (prime[i]) {
                    for (int j = 2 * i; j < N; j += i) {
                        prime[j] = false;
                    }
                }
            }

            int[] cnt = new int[N];
            Arrays.fill(cnt, 0);

            for (int i = 2; i < N; ++i) {
                cnt[i] = cnt[i - 1];
                if (i % 2 == 1 && prime[i] && prime[(i + 1) / 2]) {
                    ++cnt[i];
                }
            }

            int q = in.nextInt();
            int l, r;
            for (int i = 0; i < q; ++i) {
                l = in.nextInt();
                r = in.nextInt();
                out.println(cnt[r] - cnt[l - 1]);
            }
        }

    }
}

