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
                int nI = container.get(n);
                int nX = nI % h;
                int nY = nI / h;
                while (container.containsKey(next)) {
                    int nextI = container.get(next);
                    int nextX = nextI % h;
                    int nextY = nextI / h;
                    dist.put(n, cd);
                    container.remove(n);
                    cd += Math.abs(nX - nextX) + Math.abs(nY - nextY);
                    n = next;
                    nX = nextX;
                    nY = nextY;
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

