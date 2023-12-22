import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

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
        TaskAC68D solver = new TaskAC68D();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAC68D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> counts = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();

                if (counts.get(a) == null) {
                    counts.put(a, 0);
                }
                int count = counts.get(a);
                counts.put(a, count + 1);
            }

            int oddDistinct = 0;
            int evenDistinct = 0;

            for (Map.Entry<Integer, Integer> entries : counts.entrySet()) {
                int c = entries.getValue();

                if (c % 2 == 0) {
                    evenDistinct++;
                } else {
                    oddDistinct++;
                }
            }
            if (evenDistinct % 2 == 0) {
                System.out.println(counts.size());
            } else {
                System.out.println(counts.size() - 1);
            }
        }

    }
}

