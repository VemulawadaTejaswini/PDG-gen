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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String a = in.next();
            String b = in.next();

            int alen = a.length();
            int blen = b.length();
            if (alen > blen) {
                for (int i = 0; i < alen - blen; i++) {
                    b = "0" + b;
                }
            } else if (alen < blen) {
                for (int i = 0; i < blen - alen; i++) {
                    a = "0" + a;
                }
            }

            if (a.compareTo(b) < 0) {
                out.println("LESS");
            } else if (a.compareTo(b) > 0) {
                out.println("GREATER");
            } else {
                out.println("EQUAL");
            }

        }

    }
}

