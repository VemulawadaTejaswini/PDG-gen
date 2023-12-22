import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.OptionalInt;

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
            int K = in.nextInt();
            String S = in.next();

            boolean[] heads = new boolean[N];
            Arrays.fill(heads, false);
            heads[0] = true;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) != S.charAt(i - 1)) {
                    heads[i] = true;
                }
            }

            int[] sums = new int[N];
            Arrays.fill(sums, 0);
            for (int i = 0; i < N; i++) {
                if (heads[i]) {
                    int count = 0;
                    int index = N;
                    for (int j = i; j < N; j++) {
                        if (heads[j] && S.charAt(j) == '0') {
                            count++;
                            if (count == K + 1) {
                                index = j;
                                break;
                            }
                        }
                    }
                    sums[i] = index - i;
                }
            }

            out.println(Arrays.stream(sums).max().getAsInt());
        }

    }
}

