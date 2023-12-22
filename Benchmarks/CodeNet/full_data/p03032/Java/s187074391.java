import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) v[i] = in.nextInt();
            int pre[] = new int[n + 1];
            int post[] = new int[n + 1];
            long ans = 0;
            for (int i = 1; i <= n; i++) pre[i] += pre[i - 1] + v[i - 1];
            for (int i = 1; i <= n; i++) post[i] += post[i - 1] + v[n - i];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i + j <= n && i + j <= k) {
                        int rem = k - i - j;
                        long curr = pre[i] + post[j];
                        ans = Math.max(ans, curr);
                        PriorityQueue<Integer> pq = new PriorityQueue<>();
                        for (int l = 0; l < i; l++) {
                            if (v[l] < 0)
                                pq.add(v[l]);
                        }
                        for (int l = 0; l < j; l++) {
                            if (v[n - l - 1] < 0)
                                pq.add(v[n - l - 1]);
                        }
                        for (int l = 0; l < rem && pq.size() > 0; l++) {
                            curr += -pq.poll();
                        }
                        ans = Math.max(ans, curr);
//                    out.println(curr + " " + i + " " + j);

                    }
                }
            }
            out.println(ans);
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

