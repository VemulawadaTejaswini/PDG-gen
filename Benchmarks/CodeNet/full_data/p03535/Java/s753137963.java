import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        TimeGap solver = new TimeGap();
        solver.solve(1, in, out);
        out.close();
    }

    static class TimeGap {
        public int ans;
        public int[] freq;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] d = in.readIntArray(n);
            freq = new int[13];
            for (int i = 0; i < n; i++) {
                freq[d[i]]++;
            }
            for (int i = 1; i < 12; i++) {
                if (freq[i] >= 3) {
                    out.println(0);
                    return;
                }
            }
            if (freq[0] >= 1) {
                out.println(0);
                return;
            }
            if (freq[12] >= 2) {
                out.println(0);
                return;
            }
            ans = 0;
            dfs(0, 0, 0, 1 << 29);
            out.println(ans);
        }

        public void dfs(int pl, int pr, int cpos, int cans) {
            cans = Math.min(cans, 24 - pl - pr);
            if (cpos == 13) {
                ans = Math.max(ans, cans);
                return;
            }
            if (freq[cpos] == 0) {
                dfs(pl, pr, cpos + 1, cans);
                return;
            }

            if (freq[cpos] == 2) {
                dfs(cpos, cpos, cpos + 1, Math.min(cans, Math.min(cpos - pl, cpos - pr)));
                return;
            }

            if (freq[cpos] == 1) {
                dfs(cpos, pr, cpos + 1, Math.min(cans, cpos - pl));
                dfs(pl, cpos, cpos + 1, Math.min(cans, cpos - pr));
                return;
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

