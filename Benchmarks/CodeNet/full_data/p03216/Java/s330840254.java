import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CKDMC solver = new CKDMC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKDMC {
        private static String s;

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            s = in.string();
        /*int[] dc = new int[n + 1];
        int[] cc = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dc[i + 1] = dc[i] + s.charAt(i) == 'D' ? 1 : 0;
            cc[i + 1] = cc[i] + s.charAt(i) == 'C' ? 1 : 0;
        }*/


            int q = in.ints();
            for (int i = 0; i < q; i++) {
                int k = in.ints();
                long ans = 0;
                int c = 0;
                int m = 0;
                int s = 0;
                for (int l = -k; l < n; l++) {
                    int r = l + k;
                    switch (charat(l)) {
                        case 'D':
                            ans += s;
                            break;
                        case 'M':
                            s -= c;
                            m--;
                            break;
                        case 'C':
                            c--;
                            break;
                    }
                    switch (charat(r)) {
                        case 'M':
                            m++;
                            break;
                        case 'C':
                            c++;
                            s += m;
                            break;
                    }
                }
                out.println(ans);
            }
        }

        private char charat(int i) {
            if (i < 0 || s.length() <= i) {
                return '-';
            } else {
                return s.charAt(i);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

