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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), sta[] = new int[m], cur[] = new int[m];
            ArrayList<Integer> sw[] = new ArrayList[m];
            for (int i = 0; i < m; ++i) sw[i] = new ArrayList<>();

            for (int i = 0; i < m; ++i) {
                int k = in.nextInt();
                for (int j = 0; j < k; ++j) sw[i].add(in.nextInt() - 1);
            }

            for (int i = 0; i < m; ++i) sta[i] = in.nextInt();

            int ans = 0;
            for (int k = 0; k < 1 << n; ++k) {
                for (int i = 0; i < m; ++i) {
                    int on = 0;
                    for (Integer pos : sw[i]) {
                        if ((k >> pos & 1) == 1) ++on;
                    }
                    cur[i] = on % 2;
                }
                boolean ok = true;
                for (int i = 0; i < m && ok; ++i) {
                    if (sta[i] != cur[i]) ok = false;
                }
                if (ok) ++ans;
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

