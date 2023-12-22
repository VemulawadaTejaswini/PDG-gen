import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Stream;
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
        BSomeSums solver = new BSomeSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSomeSums {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());

            int ans = 0;
            for (int i = 1; i <= n; i++) {
                int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
                if (sum >= a && sum <= b) {
                    ans += i;
                }
            }
            out.println(ans);
        }

    }
}

