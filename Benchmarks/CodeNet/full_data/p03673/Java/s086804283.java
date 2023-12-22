import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author G. Guarnieri
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int[] outcome = new int[n];
            int mid = n / 2;
            int switchPoint = n % 2;
            for (int i = 0; i < n; i++) {
                int index = mid - Math.floorDiv(-i, 2) * (i % 2 == switchPoint ? 1 : -1);
                outcome[index] = a[i];
            }

            final String collect = Arrays.stream(outcome).mapToObj(Integer::toString).collect(Collectors.joining(" "));
            out.println(collect);
        }

    }
}

