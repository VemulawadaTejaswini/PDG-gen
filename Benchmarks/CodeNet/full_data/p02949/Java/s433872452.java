import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            long p = s.nextInt();
            ArrayList<pair<Integer, Integer>>[] a = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                a[i] = new ArrayList<>();
            }
            while (m-- > 0) {
                a[s.nextInt() - 1].add(new pair(s.nextInt() - 1, s.nextInt()));
            }
            boolean[] vis = new boolean[n], done = new boolean[n];
            long[] coins = new long[n], time = new long[n];
            Arrays.fill(coins, (long) -1e6);
            Arrays.fill(time, (long) 1e6);
            coins[0] = 0;
            time[0] = 0;
            vis[0] = true;
            done[n - 1] = true;
            dfs(0, a, vis, coins, time, done, p, n);
            for (int cur = 0; cur < n; cur++) {
                if (done[cur]) {
                    for (pair<Integer, Integer> i : a[cur]) {
                        if (done[i.x] && coins[cur] + i.y - p * (time[cur] + 1) > coins[i.x] - p * (time[i.x])) {
                            w.println(-1);
                            return;
                        }
                    }
                }
            }
            w.println(Math.max(0, coins[n - 1] - p * time[n - 1]));
        }

        void dfs(int cur, ArrayList<pair<Integer, Integer>>[] a, boolean[] vis, long[] coins, long[] time, boolean[] done, long p, int n) {
            for (pair<Integer, Integer> i : a[cur]) {
                if (coins[cur] + i.y - p * (time[cur] + 1) > coins[i.x] - p * (time[i.x])) {
                    coins[i.x] = coins[cur] + i.y;
                    time[i.x] = time[cur] + 1;
                }
                if (!vis[i.x]) {
                    vis[i.x] = true;
                    dfs(cur, a, vis, coins, time, done, p, n);
                    if (done[i.x]) done[cur] = true;
                }
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            if (this.x.compareTo(other.x) != 0) return this.x.compareTo(other.x);
            return this.y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return this.x.equals(other.x) && this.y.equals(other.y);
        }

        public int hashCode() {
            return toString().hashCode();
        }

    }
}

