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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        long ans = 0;
        int n = 0;

        public void z(char a[], int start) {
            int z[] = new int[n];
            int l = 0;
            int r = 0;
            int k = 0;
            for (int i = 1 + start; i < n; i++) {
                if (i > r) {
                    l = r = i;
                    while (r < n && a[r - l + start] == a[r] && r - l + start < i)
                        r++;
                    z[i] = r - l;
                    r--;
                } else {
                    k = i - l + start;
                    if (z[k] < r - i - l + start)
                        z[i] = z[k];
                    else {
                        l = i;
                        while (r < n && a[r - l + start] == a[r] && r - l + start < i)
                            r++;
                        z[i] = r - l;
                        r--;
                    }
                }
                ans = Math.max(ans, z[i]);

            }

        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            String x = in.next();
            char a[] = x.toCharArray();
            for (int i = 0; i < n; i++) {
                z(a, i);
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

