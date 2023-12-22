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
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        private int[][] dp;
        private int[][] pts;
        private int n;

        public void solve(int testNumber, Reader in, PrintWriter out) {
            n = in.nextInt();
            pts = new int[n][3];
            dp = new int[n][3];
            for (int i = 0; i < n; ++i) {
                pts[i][0] = in.nextInt();
                pts[i][1] = in.nextInt();
                pts[i][2] = in.nextInt();

                dp[i][0] = -1;
                dp[i][1] = -1;
                dp[i][2] = -1;
            }
            int x = maxPts(n, 0);
            for (int i = 0; i < n; ++i) {
                dp[i][0] = -1;
                dp[i][1] = -1;
                dp[i][2] = -1;
            }
            int y = maxPts(n, 1);
            for (int i = 0; i < n; ++i) {
                dp[i][0] = -1;
                dp[i][1] = -1;
                dp[i][2] = -1;
            }
            int z = maxPts(n, 2);
            out.println(Math.max(Math.max(x, y), z));
        }

        private int maxPts(int d, int flag) {
            if (d == 1) {
                return pts[n - d][flag];
            }

            if (dp[n - d][flag] != -1) return dp[n - d][flag];

            for (int i = 0; i < 3; ++i) {
                if (flag != i) {
                    dp[n - d][flag] = Math.max(dp[n - d][flag], pts[n - d][flag] + maxPts(d - 1, i));
                }
            }
            return dp[n - d][flag];
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

