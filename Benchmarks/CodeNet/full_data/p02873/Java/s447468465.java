import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        int[][] graph;
        int[] deg;
        int[] value;

        int calc(int u) {
            if (value[u] >= 0) {
                return value[u];
            }
            int max = 0;
            int[] g = graph[u];
            for (int t = 0; t < deg[u]; t++) {
                int tmp = value[g[t]] + 1;
                if (tmp == 0) {
                    tmp = calc(g[t]) + 1;
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
            return value[u] = max;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            char[] c = in.next().toCharArray();
            int n = c.length + 1;
            graph = new int[n][2];
            deg = new int[n];
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '<') {
                    graph[i + 1][deg[i + 1]++] = i;
                } else {
                    graph[i][deg[i]++] = i + 1;
                }
            }
            value = new int[n];
            Arrays.fill(value, -1);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += calc(i);
            }
            out.println(sum);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
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

