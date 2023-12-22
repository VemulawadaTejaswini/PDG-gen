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
        Tenka1_2017_C solver = new Tenka1_2017_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class Tenka1_2017_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();

            for (long h = 1; h <= 3500; h++) {
                for (long n = 1; n <= 3500; n++) {
                    try {
                        long child = N * h * n;
                        long mother = (4 * h * n) - (N * n) - (N * h);
                        if (child % mother == 0 && mother > 0) {
                            out.print(h + " " + n + " " + child / mother);
                            return;
                        }


                    } catch (ArithmeticException e) {

                    }

                }
            }

        }

    }
}

