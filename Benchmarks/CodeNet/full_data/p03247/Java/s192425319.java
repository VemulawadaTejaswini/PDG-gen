import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[][] p = in.nextIntArray2D(n, 2);
            int parity = 0;
            for (int[] pp : p) {
                parity |= 1 << ((pp[0] + pp[1]) & 1);
            }
            if (parity == 3) {
                out.println(-1);
                return;
            }

            List<Integer> d = new ArrayList<>();
            StringBuilder[] ans = new StringBuilder[n];
            for (int i = 0; i < n; i++) ans[i] = new StringBuilder();
            for (int i = 30; i >= 0; i--) {
                while (true) {
                    List<Integer> cand = new ArrayList<>();
                    for (int j = 0; j < n; j++) {
                        if (((Math.abs(p[j][0]) | Math.abs(p[j][1])) & (1 << i)) != 0) {
                            cand.add(j);
                        }
                    }
//                dump(i, cand, p);
                    if (cand.isEmpty()) break;
                    if (cand.size() == n) {
                        d.add(1 << i);
                        for (int j = 0; j < n; j++) {
                            for (int k = 0; k < 2; k++) {
                                if ((Math.abs(p[j][k]) & 1 << i) != 0) {
                                    if (k == 0) {
                                        ans[j].append(p[j][k] > 0 ? 'R' : 'L');
                                    } else {
                                        ans[j].append(p[j][k] > 0 ? 'U' : 'D');
                                    }

                                    p[j][k] += p[j][k] > 0 ? -(1 << i) : (1 << i);
                                    break;
                                }
                            }
                        }
                    } else {
                        d.add(1 << (i - 1));
                        d.add(1 << (i - 1));
                        for (int j = 0; j < n; j++) {
                            if (!cand.contains(j)) {
                                ans[j].append('R');
                                ans[j].append('L');
                                continue;
                            }
                            for (int k = 0; k < 2; k++) {
                                if ((Math.abs(p[j][k]) & 1 << i) != 0) {
                                    if (k == 0) {
                                        ans[j].append(p[j][k] > 0 ? 'R' : 'L');
                                        ans[j].append(p[j][k] > 0 ? 'R' : 'L');
                                    } else {
                                        ans[j].append(p[j][k] > 0 ? 'U' : 'D');
                                        ans[j].append(p[j][k] > 0 ? 'U' : 'D');
                                    }

                                    p[j][k] += p[j][k] > 0 ? -(1 << i) : (1 << i);
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            out.println(d.size());
            for (int i = 0; i < d.size(); i++) {
                out.print(d.get(i) + (i == d.size() - 1 ? "\n" : " "));
            }
            for (StringBuilder sb : ans) {
                out.println(sb.toString());
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

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[][] nextIntArray2D(final int n, final int k) {
            final int[][] res = new int[n][];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(k);
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

