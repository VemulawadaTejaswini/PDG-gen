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
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = Integer.parseInt(in.next());

            long n = 0;
            while (k > 0) {
                n++;
                if (isRunrun(n)) {
                    k--;
                }
            }

            out.println(n);
        }

        boolean isRunrun(long n) {
            String s = String.valueOf(n);
            boolean flag = true;
            long m0 = n % 10;
            n = n / 10;

            long m1;
            for (int i = 0; i < s.length(); i++) {
                if (n > 0) {
                    m1 = n % 10;

                    if (Math.abs(m0 - m1) > 1) {
                        flag = false;
                        break;
                    }
                    m0 = m1;
                    n = n / 10;
                } else {
                    break;
                }
            }
            return flag;
        }

    }
}

