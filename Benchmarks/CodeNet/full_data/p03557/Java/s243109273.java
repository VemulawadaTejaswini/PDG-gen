import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] top = in.nextIntArraySorted(n);
            int[] middle = in.nextIntArraySorted(n);
            int[] bottom = in.nextIntArraySorted(n);

            long ans = 0;
            for (int i = 0; i < n; i++) {
                long t = ArrayUtils.upperBound(top, middle[i] - 1) + 1;
                long b = n - ArrayUtils.lowerBound(bottom, middle[i] + 1);
                ans += t * b;
            }

            out.println(ans);
        }

    }

    static class ArrayUtils {
        public static int lowerBound(int[] a, int x) {
            int high = a.length;
            int low = -1;
            while (high - low > 1) {
                int mid = (high + low) / 2;
                if (a[mid] < x) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
            return high;
        }

        public static int upperBound(int[] a, int x) {
            int high = a.length;
            int low = -1;
            while (high - low > 1) {
                int mid = (high + low) / 2;
                if (a[mid] <= x) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
            return low;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArraySorted(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            Arrays.sort(res);
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

