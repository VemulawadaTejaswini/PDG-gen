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
    static int N, W;
    static int[] w;
    static int[] v;
    static int[] c;
    static HashSet<Integer> items_set = new HashSet<>();

    static long[][] dp;

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        W = in.nextInt();
        w = new int[N + 1];
        v = new int[N + 1];

        dp = new long[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
            items_set.add(i);
            Arrays.fill(dp[i],-1);
        }

        System.out.println(knapSack(W,N));
        
    }

   static long knapSack(int c, int i) {
        // base condition
        if (i < 0)
            return 0;

        //..if value already exists directly return    
        if (dp[i][W] != -1)
            return dp[i][W];

        if (w[i] <= W) {
            //..ignore ith element and consider rest of i-1 elements
            long temp1 = knapSack(c, i - 1);
            //..consider ith element so reduce capacity
            long temp2 = v[i] + knapSack(c - w[i], i - 1);

            //..store it
            dp[i][W] = Math.max(temp1,temp2);

            return dp[i][W];

        } else { // ..weight of ith element is more than c
            dp[i][W] = knapSack(W, i - 1);
            return dp[i][W];
        }
    }

}
