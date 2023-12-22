import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int ans = 0;
            Set<Integer> cand = new TreeSet<>();
            for (int i = 0; i < 2; i++) {
                Map<Integer, Integer> mp = new TreeMap<>();
                int c = 0;
                for (int j = i; j < n; j += 2, c++) {
                    mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
                }
                int[] max = new int[3];
                int[] maxi = new int[3];
                for (Map.Entry<Integer, Integer> v : mp.entrySet()) {
                    for (int j = 0; j < max.length; j++) {
                        if (max[j] < v.getValue()) {
                            for (int k = max.length - 2; k >= j; k--) {
                                max[k + 1] = max[k];
                                maxi[k + 1] = maxi[k];
                            }
                            max[j] = v.getValue();
                            maxi[j] = v.getKey();
                        }
                    }
                }
                for (int j = 0; j < max.length; j++) {
                    if (max[j] > 0) cand.add(maxi[j]);
                }
            }
            if (cand.size() == 1) {
                out.println(n - n / 2);
                return;
            }
            ans = Integer.MAX_VALUE;
            for (int x : cand) {
                for (int y : cand)
                    if (x != y) {
                        int cnt = 0;
                        for (int i = 0; i < n; i += 2) if (x != a[i]) cnt++;
                        for (int i = 1; i < n; i += 2) if (y != a[i]) cnt++;
                        ans = Math.min(ans, cnt);
                    }
            }
            out.println(ans);
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

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

