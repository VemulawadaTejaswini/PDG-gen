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
        abc162_b solver = new abc162_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc162_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            long fizzsum = 0;
            long buzzsum = 0;
            long fizzbuszsum = 0;
            long sum = 0;

            for (long i = 0; i <= N; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    fizzbuszsum += i;
                } else if (i % 3 == 0) {
                    fizzsum += i;
                } else if (i % 5 == 0) {
                    buzzsum += i;
                } else {
                    sum += i;
                }
            }

        /*
        for (long i = 3; i <= N; i+=3) {
            if(i%15!=0) {
                fizzsum += i;
            }
        }
        for (long i = 5; i <= N; i+=5) {
            if(i%15!=0) {
                buzzsum += i;
            }
        }
        for (long i = 15; i <= N; i+=15) {
            fizzbuszsum+=i;
        }

         */
            out.println(sum);
        }

    }
}

