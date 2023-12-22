import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        DMedianOfMedians solver = new DMedianOfMedians();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMedianOfMedians {
        Random random = new Random(543534151132L + System.currentTimeMillis());
        private int[] ft;
        private int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();
            int[] sorted = a.clone();
            mySort(sorted);

            int l = 0;
            int r = n;
            int cmp[] = new int[n];
            int presum[] = new int[n];
            ft = new int[n + 1];
            while (r - l > 1) {
                int mid = (l + r) / 2, cur = sorted[mid];
                for (int i = 0; i < n; ++i) {
                    if (a[i] >= cur) cmp[i] = 1;
                    else cmp[i] = -1;
                }
                presum[0] = cmp[0];
                int offset = cmp[0];
                for (int i = 1; i < n; ++i) {
                    presum[i] = presum[i - 1] + cmp[i];
                    offset = Math.min(offset, presum[i]);
                }
                if (offset < 0) offset = 1 - offset;

                for (int i = 0; i < n; ++i) ft[i] = 0;
                long cnt = 0;
                for (int i = 0; i < n; ++i) {
                    cur = presum[i] + offset;
                    update(cur, 1);
                    cnt += sum(cur);
                }

                if (cnt >= (long) ((1 + n) * n / 2 + 1) / 2) l = mid;
                else r = mid;
            }
            out.println(sorted[l]);
        }

        private int lowbit(int n) {
            return n & (-n);
        }

        private long sum(int x) {
            long ans = 0;
            while (x > 0) {
                ans += ft[x];
                x -= lowbit(x);
            }
            return ans;
        }

        private void update(int x, int d) {
            while (x <= n) {
                ft[x] += d;
                x += lowbit(x);
            }
        }

        private void mySort(int[] s) {
            for (int i = 0; i < s.length; ++i) {
                int j = random.nextInt(i + 1);
                int t = s[i];
                s[i] = s[j];
                s[j] = t;
            }
            Arrays.sort(s);
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

