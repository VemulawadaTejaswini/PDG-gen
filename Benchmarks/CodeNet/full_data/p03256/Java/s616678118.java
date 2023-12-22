import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        CABlandYard solver = new CABlandYard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABlandYard {
        List<Integer>[] graph;
        char[] s;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            s = in.next().toCharArray();
            graph = Utils.listArray(n);

            int[][] count = new int[n][2];
            for (int i = 0; i < m; i++) {
                int from = in.nextInt() - 1, to = in.nextInt() - 1;
                graph[from].add(to);
                graph[to].add(from);
                count[from][s[to] - 'A']++;
                count[to][s[from] - 'A']++;
            }

            int[] q = new int[n];
            int head = 0, tail = 0;
            boolean[] bad = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (count[i][0] == 0 || count[i][1] == 0) {
                    bad[i] = true;
                    q[tail++] = i;
                }
            }
            while (head < tail) {
                int cur = q[head++];
                for (int j : graph[cur]) {
                    count[j][s[cur] - 'A']--;
                    if (count[j][s[cur] - 'A'] == 0 && !bad[j]) {
                        bad[j] = true;
                        q[tail++] = j;
                    }
                }
            }


            out.println(head < n ? "Yes" : "No");
        }

    }

    static class Utils {
        public static <T> List<T>[] listArray(int size) {
            List<T>[] result = new List[size];
            for (int i = 0; i < size; i++) {
                result[i] = new ArrayList<>();
            }
            return result;
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

