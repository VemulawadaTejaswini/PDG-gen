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
            String S = in.next();
            int[] alphabets = new int[3];
            for (int i = 0; i < S.length(); i++) {
                alphabets[S.charAt(i) - 'a']++;
            }

            boolean ok = true;
            if (alphabets[0] > alphabets[1] + 1) ok = false;
            if (alphabets[1] > alphabets[2] + 1) ok = false;
            if (alphabets[2] > alphabets[0] + 1) ok = false;
            if (alphabets[1] > alphabets[0] + 1) ok = false;
            if (alphabets[2] > alphabets[1] + 1) ok = false;
            if (alphabets[0] > alphabets[2] + 1) ok = false;
            out.println(ok ? "YES" : "NO");

        }

    }
}

