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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        private int[] dig;
        private int[] enu;
        private int n;
        private int len;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            dig = new int[20];
            enu = new int[]{3, 5, 7};
            n = in.nextInt();
            while (n > 0) {
                dig[len++] = n % 10;
                n /= 10;
            }
            out.println(calc(len - 1, new boolean[3], false, false));
        }

        private int calc(int curi, boolean[] has, boolean issmaller, boolean hasstarted) {
            if (curi == -1) return hasstarted && has[0] && has[1] && has[2] ? 1 : 0;
            int ans = 0;
            if (issmaller) {
                for (int i = 0; i < 3; ++i) {
                    boolean tmp[] = has.clone();
                    tmp[i] = true;
                    ans += calc(curi - 1, tmp, true, true);
                }
                if (!hasstarted) ans += calc(curi - 1, has, true, false);
            } else {
                for (int i = 0; i < 3; ++i) {
                    boolean tmp[] = has.clone();
                    tmp[i] = true;
                    if (enu[i] < dig[curi]) ans += calc(curi - 1, tmp, true, true);
                    else if (enu[i] == dig[curi]) ans += calc(curi - 1, tmp, false, true);
                }
                if (!hasstarted) ans += calc(curi - 1, has, true, false);
            }
            return ans;
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

