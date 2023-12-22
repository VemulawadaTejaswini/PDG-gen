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
        Otoshidama solver = new Otoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class Otoshidama {
        int n;
        long y;
        int a = -1;
        int b = -1;
        int c = -1;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            y = in.nextLong();

            recursive(0, 0, 0, 0);
            if (a != -1) {
                out.println(String.format("%d %d %d", c, b, a));
            }
        }

        private void recursive(int count, int sen, int gosen, int man) {
            long result = sen * 1000 + gosen * 5000 + man * 10000;
            if (count == n) {
                if (result == y) {
                    a = sen;
                    b = gosen;
                    c = man;
                }
                return;
            }
            if (result > y) {
                return;
            }
            recursive(count + 1, sen + 1, gosen, man);
            recursive(count + 1, sen, gosen + 1, man);
            recursive(count + 1, sen, gosen, man + 1);
        }

    }
}

