import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
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
        BTollGates solver = new BTollGates();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTollGates {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), x = in.nextInt();
            int[] a = IntStream.range(0, m).map(i -> in.nextInt()).toArray();
            out.println(Math.min(
                    Arrays.stream(a)
                            .filter(i -> i > x)
                            .count(),
                    Arrays.stream(a)
                            .filter(i -> i < x)
                            .count()
            ));

        }

    }
}

