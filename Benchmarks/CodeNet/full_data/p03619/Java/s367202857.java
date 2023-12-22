import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final int MAX_COORD = (int) 1e8;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int n = in.nextInt();
            boolean flipx = false;
            if (x1 > x2) {
                flipx = true;
                x1 = MAX_COORD - x1;
                x2 = MAX_COORD - x2;
            }
            boolean flipy = false;
            if (y1 > y2) {
                flipy = true;
                y1 = MAX_COORD - y1;
                y2 = MAX_COORD - y2;
            }
            List<TaskC.Pair> pairs = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                int x = in.nextInt();
                if (flipx) x = MAX_COORD - x;
                int y = in.nextInt();
                if (flipy) y = MAX_COORD - y;
                if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
                    pairs.add(new TaskC.Pair(x, y));
                }
            }
            Collections.sort(pairs, new Comparator<TaskC.Pair>() {

                public int compare(TaskC.Pair o1, TaskC.Pair o2) {
                    return Integer.compare(o1.x, o2.x);
                }
            });
            int[] best = new int[pairs.size() + 1];
            Arrays.fill(best, MAX_COORD + 1);
            best[0] = 0;
            for (TaskC.Pair p : pairs) {
                int val = p.y;
                int pos = Arrays.binarySearch(best, val);
                if (pos < 0) pos = -pos - 1;
                best[pos] = val;
            }
            int cnt = -1;
            for (int x : best) if (x <= MAX_COORD) ++cnt;
            int straight = x2 - x1 + y2 - y1 - cnt;
            int curved = cnt;
            int extra = 0;
            if (cnt == x2 - x1 + 1 || cnt == y2 - y1 + 1) {
                --curved;
                ++extra;
            }
            out.println(straight * 100 + curved * (80 + 5 * Math.PI) + extra * (80 + 10 * Math.PI));
        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

