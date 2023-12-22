import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n + 1];
            long st[] = new long[61];
            long temp = 0;
            long ans = 0;
            long tn = n;
            for (int i = 0; i < n; i++) {
                temp = in.nextLong();
                a[i] = temp;
                for (int j = 0; j < 61; j++) {
                    if ((temp & 1) == 1) st[j]++;
                    temp /= 2;
                }

//            for(int j=0;j<61;j++)out.print(st[j]);
//            out.println();
            }
            long mod = 1000000007;
            for (int i = 0; i < n; i++) {
                temp = a[i];
                long slash = 1;
                tn--;
                for (int j = 0; j < 61; j++) {
                    if ((temp & 1) == 1) {
                        st[j]--;
                        ans += ((tn - st[j]) * slash) % mod;
                        ans %= mod;
                    } else {
                        ans += (st[j] * slash);
                        ans %= mod;
                    }
                    temp /= 2;
                    slash = (slash << 1) % mod;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


