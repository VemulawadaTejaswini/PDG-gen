import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.io.InputStream;
import java.util.ArrayList;

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
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            List<Integer> ans = f(n, a, b);
            if (ans == null) {
                out.println("NO");
                return;
            }
            out.println("YES");
            printList(out, ans);
        }

        List<Integer> f(int n, int a, int b) {
            if (Integer.bitCount(a) % 2 == Integer.bitCount(b) % 2) {
                return null;
            }

            int[] xs = new int[1 << n];
            List<Integer>[] bits = new List[n + 1];
            for (int i = 0; i < bits.length; i++) {
                bits[i] = new ArrayList<>();
            }
            for (int i = 0; i < 1 << n; i++) {
                bits[Integer.bitCount(i)].add(i);
            }
            b ^= a;
            List<Integer> ans = gray(n, b, true);
            for (int i = 0; i < ans.size(); i++) {
                ans.set(i, ans.get(i) ^ a);
            }
            return ans;
        }

        List<Integer> gray(int n, int first, boolean end) {
            List<Integer> ans = new ArrayList<>();
            if (n == 1) {
                if (end) {
                    ans.add(1 ^ first);
                    ans.add(first);
                } else {
                    ans.add(first);
                    ans.add(1 ^ first);
                }
                return ans;
            }
            List<Integer> r = gray(n - 1, first & ~(1 << (n - 1)), !end);
            ans.addAll(r);
            Collections.reverse(r);
            for (int x : r) {
                ans.add(x | 1 << (n - 1));
            }
            return ans;
        }

        static void printList(PrintWriter out, List<?> p) {
            for (int i = 0; i < p.size(); i++) {
                out.print(p.get(i) + (i == p.size() - 1 ? "\n" : " "));
            }
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

