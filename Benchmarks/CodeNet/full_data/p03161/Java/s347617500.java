import java.util.*;
import java.io.*;

class Main {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    static final Reader in = new Reader();
    static int N,K;
    static int[] h;

    static long[] dp;

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        K = in.nextInt();
        h = new int[N];
        dp = new long[N];
        for (int i = 0; i < N; i++)
            h[i] = in.nextInt();

        // System.out.println(getAns(N - 1));
        dp[1] = Math.abs(h[1] - h[0]);
        for(int i = 2;i < N;i++)
        {
            long min = Long.MAX_VALUE;
            for(int j = 1;j <= K;j++)
                if(i-j >= 0){
                    // System.out.println("i = "+i+" j = "+j+" dp = "+dp[i-j]+" min = "+min);
                    min = Math.min(dp[i-j] + Math.abs(h[i] - h[i-j]),min);
                }
            dp[i] = min;   
        }

        System.out.println(dp[N-1]);
    }

    static long getAns(int n) {
        // System.out.println("n = "+n);
        if (n == 0)
            return 0;
        if (n == 1)
            return Math.abs(h[1] - h[0]);

        long ans1;
        if (dp[n - 1] == 0)
            dp[n - 1] = getAns(n - 1);
        ans1 = dp[n - 1];
        ans1 += Math.abs(h[n] - h[n - 1]);

        long ans2;
        if (dp[n - 2] == 0)
            dp[n - 2] = getAns(n - 2);
        ans2 = dp[n - 2];
        ans2 += Math.abs(h[n] - h[n - 2]);
        // System.out.println("n = "+n+" ans1 = "+ans1+" ans2 = "+ans2);

        return Math.min(ans1, ans2);
    }
    
}