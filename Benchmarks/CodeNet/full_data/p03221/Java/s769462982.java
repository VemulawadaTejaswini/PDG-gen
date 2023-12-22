import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] p = new long[m];
            long[] y = new long[m];
            for (int i = 0; i < m; i++) {
                p[i] = in.nextLong();
                y[i] = in.nextLong();
            }

            TreeMap<Long, TreeSet<Long>> map = new TreeMap<>();
            for (int i = 0; i < m; i++) {
                if (!map.containsKey(p[i])) map.put(p[i], new TreeSet<>());
                map.get(p[i]).add(y[i]);
            }

            TreeMap<Long, TreeMap<Long, Integer>> map2 = new TreeMap<>();
            for (Long x : map.keySet()) {
                TreeMap<Long, Integer> map3 = new TreeMap<>();
                int index = 1;
                for (Long t : map.get(x)) {
                    map3.put(t, index++);
                }
                map2.put(x, map3);
            }

            for (int i = 0; i < m; i++) {
                out.println(String.format("%06d%06d", p[i], map2.get(p[i]).get(y[i])));
            }
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

    }
}

