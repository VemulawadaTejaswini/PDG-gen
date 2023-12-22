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
        abc134_b solver = new abc134_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc134_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int D = in.nextInt();

            int mans = (int) Math.ceil(N / ((D * 2) + 1));
            if (N % ((D * 2) + 1) != 0) {
                mans++;
            }
            out.println(mans);

        }

    }
}

