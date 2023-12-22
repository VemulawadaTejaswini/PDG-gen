import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author John Martin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FPlayingTagOnTree solver = new FPlayingTagOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPlayingTagOnTree {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), t = c.readInt() - 1, a = c.readInt() - 1;
            ArrayList<Integer> adj[] = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                int u = c.readInt() - 1, v = c.readInt() - 1;
                adj[u].add(v);
                adj[v].add(u);
            }

            int parent[] = new int[n], dp[] = new int[n];
            dfs(a, -1, adj, parent, dp);
            ArrayList<Integer> follow_path = new ArrayList<>();
            dfs_(t, parent, follow_path);
            int ptr1 = 0, ptr2 = follow_path.size() - 1;
            int max_res = 0;
//        w.printLine(follow_path);
            while (ptr1 <= ptr2) {

                int res = ptr1 + (dp[follow_path.get(ptr1)]) + (ptr2 - ptr1 - 1);
                //w.printLine(ptr1,ptr2,res,dp[follow_path.get(ptr1)]);
                max_res = Math.max(max_res, res);

                ptr1++;
                ptr2--;
            }
            w.printLine(max_res);

        }

        private void dfs_(int x, int[] parent, ArrayList<Integer> follow_path) {
            if (x == -1) {
                return;
            }
            follow_path.add(x);
            dfs_(parent[x], parent, follow_path);
        }

        private int dfs(int x, int p, ArrayList<Integer>[] adj, int[] parent, int[] dp) {
            parent[x] = p;
            int max = 0;
            for (int k : adj[x]) {
                if (k != p) {
                    max = Math.max(max, dfs(k, x, adj, parent, dp) + 1);
                }
            }

            dp[x] = max;
            return dp[x];
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

