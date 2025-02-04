
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * Created by jaga on 9/22/16.
 */
public class Main{
    public static void solve(PrintWriter out, FastScanner in) {
        int N = in.nextInt();
        int a[] = new int[N];
        //以下1-indexed
        int b[] = new int[N + 2];//b[i] = k : 左から見ていったときの初めて i > a[k] となるk 0で初期化
        int c[] = new int[N + 2];//b[i] = k : 右から見ていったときの初めて i > a[k] となるk N + 1で初期化
        int r[] = new int[N + 2];
        int l[] = new int[N + 2];
        Arrays.fill(c, N + 1);
        Arrays.fill(r, N + 1);

        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
            l[a[i]] = b[a[i]];
            Arrays.fill(b, a[i] + 1, N + 2, i + 1);
        }
        for (int i = 0; i < N; i++) {
            r[a[N-i - 1]] = c[a[N - i - 1]];
            Arrays.fill(c, a[N - i - 1] + 1, N + 2, N - i);
        }

        long res = 0;
        for (int i = 0; i < N; i++) {
            int sl = (i + 1) - l[a[i]];
            int sr = r[a[i]] - (i + 1);
            res += sl * sr * a[i];
        }
        System.out.println(res);
    }

    public static void solve2(PrintWriter out, FastScanner in) {
        //TLEする
        int N = in.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }

        long res = 0;

        for (int i = 0; i < N; i++) {
            int min = a[i];
            for (int k = i; k < N; k++) {
                min = Math.min(a[k], min);
                res += min;
            }
        }
        System.out.println(res);
    }

    static class Pair implements Comparable {
        int first, second;

        Pair(int a, int b) {
            first = a;
            second = b;
        }

        public int compareTo(Object other) {
            Pair p1 = (Pair) other;
            return this.first - ((Pair) other).first; // IDの値に従い昇順で並び替えたい場合
//         return -(this.first - ((Pair) other).first); // IDの値に従い降順で並び替えたい場合
        }
    }

    /*以下はテンプレ*/
    public static void main(String args[]) {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastScanner in = new FastScanner();
        solve(out, in);
        out.close();
    }

    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufferLength <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextDoubleArray(m);
            }
            return map;
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = nextInt();
            return array;
        }

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) array[i] = nextLong();
            return array;
        }

        public String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) array[i] = next();
            return array;
        }

        public char[][] nextCharMap(int n) {
            char[][] array = new char[n][];
            for (int i = 0; i < n; i++) array[i] = next().toCharArray();
            return array;
        }

        public int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextIntArray(m);
            }
            return map;
        }
    }
}

