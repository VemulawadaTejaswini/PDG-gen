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
            long[][] ps = new long[60][2];
            for (int i = 59; i >= 0; i--) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (((as[j] >> i) & 1) > 0) {
                        cnt++;
                    }
                }
                ps[i][0] = (1l << i) * cnt;
                ps[i][1] = (1l << i) * (n - cnt);
            }
            long max = 0;
            for (int i = 59; i >= 0; i--) {
                if (((k >> i) & 1) > 0) {
                    long tmp = 0;
                    for (int j = 59; j > i; j--) {
                        tmp += ps[j][(int)((k >> j) & 1)];
                    }
                    tmp += ps[i][0];
                    for (int j = i - 1; j >= 0; j--) {
                        tmp += Math.max(ps[j][0], ps[j][1]);
                    }
                    max = Math.max(max, tmp);
                }
            }
            long tmp = 0;
            for (int j = 59; j >= 0; j--) {
                tmp += ps[j][(int)((k >> j) & 1)];
            }
            out.println(Math.max(max, tmp));
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
