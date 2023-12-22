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
        XORWorld solver = new XORWorld();
        solver.solve(1, in, out);
        out.close();
    }

    static class XORWorld {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();

            int shift = 0;
            long two_index = 1;
            long result = 0;

            while (b >> shift > 0) {
                long one = 0;
                long index = a;
                while (index <= b) {
                    if (((index >> shift) & 1) == 1) {
                        one++;
                    }
                    index++;
                }

                if (one % 2 == 1) {
                    result += two_index;
                }
                shift++;
                two_index *= 2;
            }

            out.println(result);
        }

    }
}

