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
            int[] black = new int[N];
            Arrays.fill(black, 0);
            for (int i = 0; i < N; i++) {
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                long w = in.nextLong();
                if (w % 2 == 1) {
                    black[v1 - 1] = 1;
                    black[v2 - 1] = 1;
                }
            }
            for (int n : black) {
                out.println(n);
            }
        }

    }
}

