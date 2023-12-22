import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), A = in.nextInt(), B = in.nextInt();
            if (n + 1 < A + B) {
                out.println(-1);
                return;
            }
            if ((n - 1) / B + 1 > A) {
                out.println(-1);
                return;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = n - i;
            }
            int sum = n - B;
            for (int i = 0, now = 0; i < B; i++) {
                int cnt = 1 + Math.min(A - 1, sum);
                ArrayUtil.reverse(a, now, now + cnt);
                now += cnt;
                sum -= (cnt - 1);
            }
            out.println(a);
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream out) {
            super(out);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public void close() {
            super.close();
        }

        public void print(int[] a) {
            for (int i = 0; i < a.length; i++) {
                if (i != 0) {
                    print(' ');
                }
                print(a[i]);
            }
        }

        public void println(int[] a) {
            print(a);
            println();
        }

    }

    static class ArrayUtil {
        public static void reverse(int[] a, int from, int to) {
            for (int left = from, right = to - 1; left < right; left++, right--) {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
            }
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

