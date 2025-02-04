import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BChocolate solver = new BChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BChocolate {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), d = in.nextInt();
            long ans = in.nextLong()
                    + IntStream.range(0, n)
                    .map(x -> divceil(d, in.nextInt()))
                    .sum();
            out.println(ans);
        }

        public int divceil(int a, int b) {
            return (a + b - 1) / b;
        }

    }
}

