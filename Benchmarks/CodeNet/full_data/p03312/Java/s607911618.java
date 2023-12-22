import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArray(n);

            RangeSum rangeSum = new RangeSum(a);

            long ans = Long.MAX_VALUE;
            int left = 0;
            int right = 2;
            for (int i = 1; i < n - 2; i++) {
                while (left + 1 < i && Math.abs(rangeSum.getSum(0, left) - rangeSum.getSum(left + 1, i))
                        > Math.abs(rangeSum.getSum(0, left + 1) - rangeSum.getSum(left + 2, i))) {
                    left++;
                }
                while (i == right || right < n - 2 && Math.abs(rangeSum.getSum(i + 1, right) - rangeSum.getSum(right + 1, n - 1))
                        > Math.abs(rangeSum.getSum(i + 1, right + 1) - rangeSum.getSum(right + 2, n - 1))) {
                    right++;
                }
                long[] arr = {
                        rangeSum.getSum(0, left),
                        rangeSum.getSum(left + 1, i),
                        rangeSum.getSum(i + 1, right),
                        rangeSum.getSum(right + 1, n - 1)
                };
                Arrays.sort(arr);
                ans = Math.min(ans, arr[3] - arr[0]);
            }

            out.println(ans);
        }

    }

    static class RangeSum {
        private long[] sum;

        public RangeSum(long[] arr) {
            sum = new long[arr.length + 1];
            System.arraycopy(arr, 0, sum, 1, arr.length);
            for (int i = 0; i < sum.length - 1; i++) {
                sum[i + 1] += sum[i];
            }
        }

        public RangeSum(int[] arr) {
            this(IntStream.of(arr).mapToLong(x -> x).toArray());
        }

        public long getSum(int left, int right) {
            if (left > right || left < 0
                    || right >= sum.length - 1) {
                throw new IllegalArgumentException();
            }

            return sum[right + 1] - sum[left];
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

    }
}

