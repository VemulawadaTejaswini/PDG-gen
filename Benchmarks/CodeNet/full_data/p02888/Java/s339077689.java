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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = in.nextInt();
            }
            Arrays.sort(L);

            long sum = 0;
            for (int i = 0; i < N - 2; i++) {
                int jl = 0;
                int js = 0;
                for (int j = i + 1; j < N - 1; j++) {
                    if (L[j] == jl) {
                        sum += --js;
                        continue;
                    }
                    jl = L[j];
                    js = 0;
                    for (int k = j + 1; k < N; k++) {
                        if (L[i] + L[j] <= L[k]) {
                            break;
                        }
                        if (check(L[i], L[j], L[k])) {
                            js++;
                        }
                    }
                    sum += js;
                }
            }
            out.println(sum);
        }

        boolean check(int a, int b, int c) {
            boolean r = a < b + c && b < c + a && c < a + b;
            return r;
        }

    }
}

