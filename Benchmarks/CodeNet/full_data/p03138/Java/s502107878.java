import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n  = in.nextInt();
            long k = in.nextLong();
            long[] as = new long[n];
            for (int i = 0; i < n; i++) {
                as[i] = in.nextLong();
            }
            long ans = 0;
            boolean strict = true;
            for (int i = 60; i >= 0; i--) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if ((as[j] & (1l << i)) > 0) {
                        cnt++;
                    }
                }

                if (cnt >= n - cnt) {
                    // 0
                    ans += (1l << i) * cnt;
                    if (strict && (k & (1 << i)) > 0) {
                        strict = false;
                    }
                } else {
                    // 1
                    if (strict && (k & (1l << i)) == 0) {
                        ans += (1l << i) * cnt;
                        continue;
                    }
                    ans += (1l << i) * (n - cnt);
                }
            }
            out.println(ans);
        }
    }

    public static void main(String argds[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}