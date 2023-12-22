import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXorSum4 solver = new DXorSum4();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum4 {
        private static final long MOD = 1000000007L;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = in.nextLong();
            }
            long sum = 0;
            for (int i = 0; i < 62; i++) {
                long zeroCount = 0, oneCount = 0, bitSum = 0;
                for (int j = 0; j < n; j++) {
                    if ((arr[j] & 1) == 0) {
                        zeroCount++;
                    } else {
                        oneCount++;
                    }
                }
                bitSum = oneCount * zeroCount;
                bitSum = ((bitSum % MOD) * ((1L << i) % MOD)) % MOD;
                sum = (sum + bitSum) % MOD;
                for (int j = 0; j < n; ++j) {
                    arr[j] >>= 1L;
                }
            }
            out.println(sum);
        }

    }

    static class InputReader {
        private StringTokenizer st;
        private BufferedReader reader;

        public InputReader(InputStream is) {
            st = null;
            reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is, 1 << 18)));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

