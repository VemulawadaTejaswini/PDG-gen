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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CExceptionHandling solver = new CExceptionHandling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExceptionHandling {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            SegmentTree st = new SegmentTree(0, n - 1);
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                st.set(i, a[i]);
            }

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    out.println(st.getMax(1, n - 1));
                } else if (i == n - 1) {
                    out.println(st.getMax(0, n - 2));
                } else {
                    out.println(Math.max(st.getMax(0, i - 1), st.getMax(i + 1, n - 1)));
                }
            }
        }

        class SegmentTree {
            int start;
            int end;
            SegmentTree leftTree;
            SegmentTree rightTree;
            int maxValue;

            public SegmentTree(int start, int end) {

                this.start = start;

                this.end = end;

                this.maxValue = Integer.MIN_VALUE;

                if (start == end) { // es una hoja

                    leftTree = rightTree = null;

                    return;

                }

                int mid = (start + end) / 2;

                leftTree = new SegmentTree(start, mid);
                rightTree = new SegmentTree(mid + 1, end);

            }

            public void set(int pos, int value) {
                // es una hoja, CASO BASE

                if (start == end) {

                    maxValue = value;

                    return;

                }

                int mid = (start + end) / 2;

                if (pos <= mid)

                    leftTree.set(pos, value);

                else

                    rightTree.set(pos, value);

                maxValue = Math.max(leftTree.maxValue, rightTree.maxValue);
            }

            public int getMax(int low, int high) {
                // [low,high] = [start,end]

                if (start == low && end == high)

                    return maxValue;

                int mid = (start + end) / 2;

                // [low,high] totalmente incluido en [start,mid]

                if (high <= mid)

                    return leftTree.getMax(low, high);

                // [low,high] totalmente incluido en [mid+1,end]

                if (low > mid)

                    return rightTree.getMax(low, high);

                // debemos dividir el intervalo en [low,mid] y [mid+1,high]

                int leftMin = leftTree.getMax(low, mid);

                int rightMin = rightTree.getMax(mid + 1, high);

                return Math.max(leftMin, rightMin);
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

