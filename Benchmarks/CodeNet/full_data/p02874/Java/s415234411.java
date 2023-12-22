import java.io.*;
import java.util.*;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/B3";

    FastScanner in;
    PrintWriter out;

    // <>>><<><<<<<>>><
    // <>>><<><<<<<>>><
    // 0, 3, 2, 1, 0, 1, 2, 0, 1, 2, 3, 4, 5, 2, 1, 0, 1

    class P {
        final int l;
        final int r;

        public P(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public String toString() {
            return "P{" +
                    "l=" + l +
                    ", r=" + r +
                    '}';
        }
    }

    public void solve() {
        int N = in.nextInt();
        P[] ps = new P[N];
        for (int i = 0; i < N; i++) {
            int l = in.nextInt(), r = in.nextInt();
            ps[i] = new P(l, r);
        }
        Arrays.sort(ps, Comparator.comparingInt(p -> p.l));

        int[] lmaxS = new int[N+1];
        int[] lmaxE = new int[N+1];
        int[] rminS = new int[N+1];
        int[] rminE = new int[N+1];
        lmaxS[0] = 0;
        rminS[0] = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            lmaxS[i+1] = Math.max(lmaxS[i], ps[i].l);
            rminS[i+1] = Math.min(rminS[i], ps[i].r);
        }
        lmaxE[N] = 0;
        rminE[N] = Integer.MAX_VALUE;
        for (int i = N - 1; i >= 0; i--) {
            lmaxE[i] = Math.max(lmaxE[i+1], ps[i].l);
            rminE[i] = Math.min(rminE[i+1], ps[i].r);
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            res = Math.max(res, ps[i].r - ps[i].l + 1 + Math.max(0, (Math.min(rminS[i], rminE[i+1]) - Math.max(lmaxS[i], lmaxE[i]) + 1)));
        }
        for (int i = 1; i < N; i++) {
            int s1 = Math.max(0, rminS[i] - lmaxS[i] + 1);
            int s2 = Math.max(0, rminE[i] - lmaxE[i] + 1);
            res = Math.max(res, s1 + s2);
        }
        System.out.println(res);
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
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

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
