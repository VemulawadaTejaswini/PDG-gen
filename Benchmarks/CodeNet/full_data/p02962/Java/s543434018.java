import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E2";

    FastScanner in;
    PrintWriter out;


    public int[] kmp(String pattern) {
        int n = pattern.length();
        int[] table = new int[n + 1];
        table[0] = -1;
        int j = -1;
        for (int i = 0; i < pattern.length(); i++) {
            while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) j = table[j];
            j++;
            table[i + 1] = j;
        }
        return table;
    }

    public int find(String target, String pattern) {
        int[] table = kmp(pattern);

        int n = target.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && target.charAt(i) != pattern.charAt(j)) {
                j = table[j];
            }
            j++;
            if (j == pattern.length()) {
                return i + 1 - pattern.length();
            }
        }
        return -1;
    }

    public int find(String target, String pattern, int[] table) {
        int res = 0;
        int cons = 0;
        int n = target.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && target.charAt(i) != pattern.charAt(j)) {
                j = table[j];
                cons = 0;
            }
            j++;
            if (j == pattern.length()) {
                cons++;
                res = Math.max(cons, res);
                j = 0;
            }
            // System.out.println(i + " " + j + " " + res);
        }
        return res;
    }

    public void solve() {
        String s = in.next();
        String t = in.next();
        int[] sKmp = kmp(s);
        int[] tKmp = kmp(t);
        int sPeriod = period(sKmp);
        int tPeriod = period(tKmp);
        if (sPeriod == tPeriod && s.substring(0, sPeriod).equals(t.substring(0, tPeriod))) {
            System.out.println("-1");
            return;
        }

        if (s.length() < t.length()) {
            StringBuilder ss = new StringBuilder();
            while (ss.length() < t.length()) {
                ss.append(s);
            }
            System.out.println(find(ss.toString(), t, tKmp));
        } else {
            String ss = s + s;
            System.out.println(find(ss, t, tKmp));
        }
    }

    private int period(int[] kmp) {
        int n = kmp.length - 1;
        int p = n - kmp[n];
        return n % p == 0 ? p : n;
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
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

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
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

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
