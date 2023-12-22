import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.Comparator;
import java.util.ArrayList;
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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        PrintWriter out;
        InputReader in;
        final Comparator<Tuple> com = new Comparator<Tuple>() {
            public int compare(Tuple t1, Tuple t2) {
                if (t1.x != t2.x)
                    return Integer.compare(t1.x, t2.x);
                else if (t1.y != t2.y)
                    return Integer.compare(t1.y, t2.y);
                else
                    return Integer.compare(t1.z, t2.z);
            }
        };

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int m = ni();
            ArrayList<Integer>[] digraph = new ArrayList[n];
            int i = 0;
            for (i = 0; i < n; i++)
                digraph[i] = new ArrayList<>();
            for (i = 0; i < m; i++) {
                int u = ni() - 1;
                int v = ni() - 1;
                digraph[u].add(v);
            }
            int s = ni() - 1;
            int t = ni() - 1;
            int[][] dist = new int[n][3];
            for (i = 0; i < n; i++)
                Arrays.fill(dist[i], (int) 1e9);
            PriorityQueue<Tuple> pq = new PriorityQueue<>(com);
            pq.add(new Tuple(0, s, 0));
            dist[0][0] = 0;
            while (pq.size() > 0) {
                Tuple curr = pq.poll();
                if (dist[curr.y][curr.z] != curr.x)
                    continue;
                for (int u : digraph[curr.y]) {
                    if (dist[u][(curr.z + 1) % 3] > dist[curr.y][curr.z] + 1) {
                        dist[u][(curr.z + 1) % 3] = dist[curr.y][curr.z] + 1;
                        pq.add(new Tuple(dist[u][(curr.z + 1) % 3], u, (curr.z + 1) % 3));
                    }
                }
            }
            if (dist[t][0] == (int) 1e9 || dist[t][0] % 3 != 0)
                pn(-1);
            else
                pn(dist[t][0] / 3);
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

        class Tuple {
            int x;
            int y;
            int z;

            Tuple(int a, int b, int c) {
                x = a;
                y = b;
                z = c;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

