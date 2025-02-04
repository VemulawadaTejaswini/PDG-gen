import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.BufferedReader;
import java.util.Collections;
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
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
//        if (true) {
//            test();
//            return;
//        }
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

            b ^= a;
            List<Integer> ans = new ArrayList<>();
            Set<Integer> used = new HashSet<>();
            ans.add(b);
            used.add(b);
            for (int i = 0; i < n; i++) {
                b |= 1 << i;
                if (used.add(b)) {
                    ans.add(b);
                }
            }
            List<Integer> ans2 = new ArrayList<>();
            ans2.add(0);
            used.add(0);
            LOOP:
            for (int i = 0; ; ) {
                for (int j = 0; j < n; j++) {
                    final int k = i ^ 1 << j;
                    if (Integer.bitCount(i) < Integer.bitCount(k)) {
                        continue;
                    }
                    if (used.add(k)) {
                        i = k;
                        ans2.add(k);
                        continue LOOP;
                    }
                }
                for (int j = 0; j < n; j++) {
                    final int k = i ^ 1 << j;
                    if (Integer.bitCount(i) > Integer.bitCount(k)) {
                        continue;
                    }
                    if (used.add(k)) {
                        i = k;
                        ans2.add(k);
                        continue LOOP;
                    }
                }
                break;
            }
            Collections.reverse(ans);
            ans2.addAll(ans);
            return flip(ans2, a);
        }

        List<Integer> flip(List<Integer> ans, int v) {
            for (int i = 0; i < ans.size(); i++) {
                ans.set(i, ans.get(i) ^ v);
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

