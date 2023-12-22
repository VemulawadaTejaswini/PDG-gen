import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();
            PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
            Set<String> vis = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 1; j <= k; j++) {
                    if (i + j <= s.length()) {
                        String sub = s.substring(i, i + j);
                        if (!vis.contains(sub)) {
                            vis.add(sub);
                            pq.add(s.substring(i, i + j));
                            if (pq.size() > k) {
                                pq.poll();
                            }
                        }
                    }
                }
            }
            out.println(pq.poll());
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

