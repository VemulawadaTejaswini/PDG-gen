import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
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
        CRemovingCoins solver = new CRemovingCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemovingCoins {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer>[] graph = Utils.listArray(n);
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                graph[a].add(b);
                graph[b].add(a);
            }
            int start = 0;

            int[] q = new int[n];
            int[] dist = new int[n];
            for (int IT = 0; IT < 2; IT++) {
                Arrays.fill(dist, -1);
                int tail = 0;
                int head = 0;
                q[tail++] = start;
                dist[start] = 0;
                while (head < tail) {
                    int i = q[head++];
                    for (int j : graph[i]) {
                        if (dist[j] == -1) {
                            dist[j] = dist[i] + 1;
                            q[tail++] = j;
                        }
                    }
                }
                start = q[n - 1];
            }
            int diam = dist[q[n - 1]];
            if (diam % 3 == 1) {
                out.println("Second");
            } else {
                out.println("First");
            }
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

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
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

