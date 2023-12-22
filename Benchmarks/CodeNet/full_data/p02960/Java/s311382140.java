import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static final int M = 1_000_000_007;

    public static void main(String[] args) {
        char[] S = new char[100000];
        int N = in.read(S, 0, S.length);
        int[][] dp = new int[N + 1][13];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            int[] d = new int[13];
            if (S[i] == '?') {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 13; k++) {
                        int h = (j + k * 10) % 13;
                        dp[i + 1][h] = (dp[i + 1][h] + dp[i][k]) % M;
                    }
                }
            } else {
                int j = S[i] - '0';
                for (int k = 0; k < 13; k++) {
                    int h = (j + k * 10) % 13;
                    dp[i + 1][h] = (dp[i + 1][h] + dp[i][k]) % M;
                }
            }
        }
        out.println(dp[N][5]);
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
                head = 0;
            }
            return cbuf[head++];
        }

        void back() {
            head--;
        }

        boolean minus() {
            boolean minus;
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
        }

        String s() {
            try {
                return readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        public int read(char[] cbuf, int off, int len) {
            skip();
            int i;
            for (i = 0; i < cbuf.length; i++) {
                char c = next();
                if (isDelimiter(c)) {
                    break;
                }
                cbuf[i] = c;
            }
            return i;
        }

        boolean isDelimiter(char c) {
            return c == ' ' || c == '\n' || c == '\r';
        }



        int i() {
            boolean minus = minus();
            int n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            for (int j = 0; j < a.length; j++) a[j] = i();
            return a;
        }

        long l() {
            boolean minus = minus();
            long n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }
    }
