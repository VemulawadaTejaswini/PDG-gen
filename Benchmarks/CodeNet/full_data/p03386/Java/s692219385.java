import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = A; i < A + K; i++) {
                if (i > B) continue;
                set.add(i);
            }
            for (int i = B - K + 1; i <= B; i++) {
                if (i < A) continue;
                set.add(i);
            }
            for (Integer i : set) {
                out.println(i);
            }
        }

    }
}

