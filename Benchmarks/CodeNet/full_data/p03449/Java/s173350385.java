import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
        public static void main(String[] args) {
                InputStream inputStream = System.in;
                OutputStream outputStream = System.out;
                InputReader in = new InputReader(inputStream);
                PrintWriter out = new PrintWriter(outputStream);
                TaskC solver = new TaskC();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskC {
                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        int n = in.i();
                        int[] a = in.ia(n);
                        int[] b = in.ia(n);
                        int[] f = new int[n + 1];
                        int[] s = new int[n + 1];
                        for (int i = 1; i <= n; i++) f[i] = f[i - 1] + a[i - 1];
                        for (int i = 1; i <= n; i++) {
                                s[i] = s[i - 1] + b[i - 1];
                        }
                        long ans = 0;
                        for (int i = 1; i <= n; i++) {
                                ans = Math.max(ans, f[i] + s[n] - s[i - 1]);
                        }
                        out.println(ans);
                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
                        if (lenbuf == -1) throw new InputMismatchException();
                        if (ptrbuf >= lenbuf) {
                                ptrbuf = 0;
                                try {
                                        lenbuf = is.read(inbuf);
                                } catch (IOException e) {
                                        throw new InputMismatchException();
                                }
                                if (lenbuf <= 0) return -1;
                        }
                        return inbuf[ptrbuf++];
                }

                public int[] ia(int n) {
                        int[] a = new int[n];
                        for (int i = 0; i < n; i++) a[i] = i();
                        return a;
                }

                public int i() {
                        int num = 0, b;
                        boolean minus = false;
                        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
                        if (b == '-') {
                                minus = true;
                                b = readByte();
                        }

                        while (true) {
                                if (b >= '0' && b <= '9') {
                                        num = num * 10 + (b - '0');
                                } else {
                                        return minus ? -num : num;
                                }
                                b = readByte();
                        }
                }

        }
}

