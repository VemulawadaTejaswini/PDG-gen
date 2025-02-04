import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
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
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
//        for (int i = 1; i <= 100; i++) {
//            int ans = Integer.MAX_VALUE;
//            for (int j = 1; j < 10000; j++) {
//                ans = Math.min(ans, sum(i * j));
////                if (i == 41 && ans == 5) {
////                    dump(i * j);
////                    return;
////                }
//            }
//            int v = i;
//            while (v % 5 == 0) v /= 5;
//            while (v % 2 == 0) v /= 2;
//            if (ans != solve2(i)) dump(i, v, ans, solve2(i));
//        }
            out.println(solve2(in.nextInt()));
        }

        int solve2(int n) {
            while (n % 2 == 0) n /= 2;
            while (n % 5 == 0) n /= 5;
            if (n == 1) return 1;
            int[] dp = new int[n + 1];
            final int INF = Integer.MAX_VALUE / 2;
            Arrays.fill(dp, INF);
            for (int i = 1; dp[i] == INF; i = i * 10 % n) {
                dp[i] = 1;
//            dump(i);
            }
            if (n <= 40000) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        dp[i] = Math.min(dp[i], dp[i - j] + dp[j]);
                    }
                }
                return dp[n];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; i * j <= n; j++) {
                    dp[i * j] = Math.min(dp[i * j], dp[i] + j - 1);
                }
            }
            int ans = sum(n);
            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, dp[i] + dp[n - i]);
            }
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <= i; j++) {
//                dp[i] = Math.min(dp[i], dp[i-j] + dp[j]);
//            }
//        }
            return ans;
        }

        int sum(int x) {
            int res = 0;
            while (x > 0) {
                res += x % 10;
                x /= 10;
            }
            return res;
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

