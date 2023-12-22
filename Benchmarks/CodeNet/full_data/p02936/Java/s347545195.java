import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        public void dfs(int root, long ans[], int[] quer, long extra, ArrayList<Integer> a[]) {
            ans[root] += quer[root] + extra;
            for (int c : a[root]) {
                dfs(c, ans, quer, ans[root], a);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            long ans[] = new long[n];
            int quer[] = new int[n];
            for (int i = 0; i < n - 1; i++) {
                a[in.nextInt() - 1].add(in.nextInt() - 1);
            }
            for (int i = 0; i < q; i++) {
                quer[in.nextInt() - 1] += in.nextInt();
            }
            dfs(0, ans, quer, 0, a);
            for (int i = 0; i < n; i++) {
                out.print(ans[i] + " ");
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

