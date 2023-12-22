import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = Integer.parseInt(in.next());
            Integer a[] = new Integer[N];
            for (byte i = 0; i < N; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(a, Comparator.reverseOrder());
            int Alice = 0;
            int Bob = 0;
            for (int i = 0; i < N; i += 2) {
                Alice += a[i];
            }
            for (int i = 1; i < N; i += 2) {
                Bob += a[i];
            }
            out.println(Alice - Bob);
        }

    }
}

