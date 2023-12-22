import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Reader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] grid = new char[h][w];
            for (int i = 0; i < h; ++i) {
                String s = in.readLine();
                for (int j = 0; j < w; ++j) {
                    grid[i][j] = s.charAt(j);
                }
            }
            int[][] dp = new int[h][w];
            dp[0][0] = 1;
            for (int i = 1; i < w; ++i) {
                dp[0][i] = (grid[0][i] == '.') ? dp[0][i - 1] : 0;
            }
            for (int i = 1; i < h; ++i) {
                dp[i][0] = (grid[i][0] == '.') ? dp[i - 1][0] : 0;
            }
            for (int i = 1; i < h; ++i) {
                for (int j = 1; j < w; ++j) {
                    if (grid[i][j] == '.') {
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
                    }
                }
            }
            out.println(dp[h - 1][w - 1]);
        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) {
            try {
                din = new DataInputStream(new FileInputStream(file_name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() {
            byte[] buf = new byte[1000005]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

