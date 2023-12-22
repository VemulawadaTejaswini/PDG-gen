import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        int[] count = new int[100];
        int N = in.nextInt();
        for (int i = 2; i <= N; i++) {
            int temp = i;
            for (int j = 2; j <= temp; j++) {
                int c = 0;
                if (temp % j == 0) {
                    while (temp % j == 0) {
                        temp /= j;
                        c++;
                    }
                }
                if (c > 0) {
                    count[j] += c;
                }
            }
            if (temp > 1) {
                count[temp]++;
            }
        }
        int[] p = Arrays.stream(count).filter(x -> x >= 2).toArray();
        int ans = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                for (int k = j + 1; k < p.length; k++) {
                    if (p[i] >= 4 && p[j] >= 4 && p[k] >= 2) {
                        ans++;
                    }
                    if (p[i] >= 4 && p[j] >= 2 && p[k] >= 4) {
                        ans++;
                    }
                    if (p[i] >= 2 && p[j] >= 4 && p[k] >= 4) {
                        ans++;
                    }
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] >= 74) {
                ans++;
            }
            for (int j = i + 1; j < p.length; j++) {
                if (p[i] >= 24 && p[j] >= 2) {
                    ans++;
                }
                if (p[i] >= 2 && p[j] >= 24) {
                    ans++;
                }
                if (p[i] >= 14 && p[j] >= 4) {
                    ans++;
                }
                if (p[i] >= 4 && p[j] >= 14) {
                    ans++;
                }
            }
        }

        out.println(ans);
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
