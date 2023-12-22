import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
            int N = Integer.parseInt(in.next());
            int Y = Integer.parseInt(in.next());
            for (int a = 0; a <= N; a++) {
                for (int b = 0; b <= N - a; b++) {
                    int c = N - a - b;
                    int total = a * 10000 + b * 5000 + c * 1000;
                    if (total == Y) {
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }

            System.out.println("-1 -1 -1");
        }

    }
}

