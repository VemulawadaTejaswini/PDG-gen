import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            a[0] = -1;
            for (int i = 1; i < n; ++i) {
                a[i] = in.nextInt() - 1;
            }
            int[] firstChild = new int[n];
            int[] nextSibling = new int[n];
            Arrays.fill(firstChild, -1);
            for (int i = 1; i < n; ++i) {
                nextSibling[i] = firstChild[a[i]];
                firstChild[a[i]] = i;
            }
            out.println(doit(0, firstChild, nextSibling));
        }

        private int doit(int root, int[] firstChild, int[] nextSibling) {
            int numChildren = 0;
            int t = firstChild[root];
            while (t >= 0) {
                ++numChildren;
                t = nextSibling[t];
            }
            int[] children = new int[numChildren];
            numChildren = 0;
            t = firstChild[root];
            while (t >= 0) {
                children[numChildren++] = doit(t, firstChild, nextSibling);
                t = nextSibling[t];
            }
            Arrays.sort(children);
            int res = 0;
            for (int i = 0; i < children.length; ++i) {
                res = Math.max(res, children[i] + children.length - i);
            }
            return res;
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

