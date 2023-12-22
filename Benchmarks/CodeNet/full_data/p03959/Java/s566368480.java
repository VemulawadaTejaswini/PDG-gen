import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int[] t = new int[n];
            for (int i = 0; i < n; ++i) {
                t[i] = in.nextInt();
            }
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            int[] l = new int[n];
            int[] r = new int[n];
            for (int i = 0; i < n; ++i) {
                l[i] = 1;
                r[i] = Integer.MAX_VALUE;
            }
            l[0] = r[0] = t[0];
            for (int i = 1; i < n; ++i) {
                if (t[i] < t[i - 1]) {
                    out.println(0);
                    return;
                }
                if (t[i] == t[i - 1]) {
                    r[i] = t[i];
                } else {
                    l[i] = t[i];
                    r[i] = t[i];
                }
            }
            l[n - 1] = Math.max(l[n - 1], a[n - 1]);
            r[n - 1] = Math.min(r[n - 1], a[n - 1]);
            for (int i = n - 2; i >= 0; --i) {
                if (a[i] < a[i + 1]) {
                    out.println(0);
                    return;
                }
                if (a[i] == a[i + 1]) {
                    r[i] = Math.min(r[i], a[i]);
                } else {
                    r[i] = Math.min(r[i], a[i]);
                    l[i] = Math.max(l[i], a[i]);
                }
            }
            long res = 1;
            int mod = 1000000007;
            for (int i = 0; i < n; ++i) {
                res *= Math.max(0, r[i] - l[i] + 1);
                res %= mod;
            }
            out.println(res);

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
