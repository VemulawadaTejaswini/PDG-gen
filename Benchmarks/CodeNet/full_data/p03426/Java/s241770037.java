import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int h = in.nextInt();
            final int w = in.nextInt();
            final int d = in.nextInt();

            Map<Integer, Integer> container = new HashMap<>();
            for (int i = 0; i < h * w; i++) {
                int n = in.nextInt();
                container.put(n, i);
            }

            Map<Integer, Integer> dist = new HashMap<>();
            while (container.size() > 0) {
                int n = Collections.max(container.keySet());
                int cd = 0;
                int next = n - d;
                while (container.containsKey(next)) {
                    int nX = container.get(n) % h;
                    int nY = container.get(n) / h;
                    int nextX = container.get(next) % h;
                    int nextY = container.get(next) / h;
                    dist.put(n, cd);
                    container.remove(n);
                    n = next;
                    cd += Math.abs(nX - nextX) + Math.abs(nY - nextY);
                    next -= d;
                }
                dist.put(n, cd);
                container.remove(n);
            }

            final int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                out.println(dist.get(l) - dist.get(r));
            }
        }

    }
}

