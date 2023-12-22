import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPalindromicNumbers solver = new BPalindromicNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPalindromicNumbers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int res = 0;
            for (int i = a; i <= b; i++) if (i / 10000 == i % 10 && i / 10 % 10 == i / 1000 % 10) res++;
            out.println(res);
        }

    }
}

