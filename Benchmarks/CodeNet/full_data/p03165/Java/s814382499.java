import java.io.*;
import java.util.*;

public class Main {
    //static String probName = "template";
    static Comparator<int[]> comp = new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            for (int i=0; i<a.length; i++) {
                if (a[i] < b[i])       return -1;
                else if (a[i] > b[i])  return 1;
            }
            return 0;
        }
    };
    static final long LARGE_LONG = 1000000000000000000L;
    static final int LARGE_INT = 1000000007;
    static final int[] dx = new int[] {1, -1, 0, 0};
    static final int[] dy = new int[] {0, 0, 1, -1};
    static int m;
    static int n;
    static char[] s;
    static char[] t;
    static int[][][] lcs;
    //lcs[i][j][0] = length of lcs occuring in s before i and in t before j. [1] is pointer for reconstructing

    public static void main(String[] argst) throws IOException {
        FastReader in = new FastReader();
        // FastReader in = new FastReader(probName + ".in");
        // Scanner in = new Scanner(System.in);

        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
        PrintWriter out = new PrintWriter(System.out);
        s = in.next().toCharArray();
        t = in.next().toCharArray();
        m = s.length;
        n = t.length;
        lcs = new int[m+1][n+1][2];
        int mx = -1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s[i-1] == t[j-1]) {
                    lcs[i][j][0] = lcs[i-1][j-1][0] + 1;
                    lcs[i][j][1] = 1;

                }
                else {
                    int plal = lcs[i-1][j][0];
                    int plar = lcs[i][j-1][0];
                    if (plal > plar) {
                        lcs[i][j][0] = plal;
                        lcs[i][j][1] = 2;
                    }
                    else {
                        lcs[i][j][0] = plar;
                        lcs[i][j][1] = 3;
                    }
                }
                mx = Math.max(mx, lcs[i][j][0]);
            }
        }
        int si = 0;
        int sj = 0;
    dumb:
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (lcs[i][j][0] == mx) {
                    si = i;
                    sj = j;
                    break dumb;
                }
            }
        }
        //System.out.println(Arrays.deepToString(lcs));
        ArrayList<Character> ll = new ArrayList<Character>();
        int count = 0;
        while (count < mx) {
            if (lcs[si][sj][1] == 1) {
                ll.add(s[si-1]);
                si--;
                sj--;
                count ++;
            }
            else if (lcs[si][sj][1] == 2) {
                si--;
            }
            else if (lcs[si][sj][1] == 3) {
                sj--;
            }
        }
        int plan = ll.size()-1;
        for (int i = plan; i >= 0; i--) {
            out.print(ll.get(i));
        }
        out.println();
        out.close();
    }

    /* FastReader code from  https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
       nextLine modified, and added next(), and hasNext()
    */
    static class FastReader {
        final private int BUFFER_SIZE = 1 << 16;
        final private int MAX_LINE_SIZE = 1 << 20;
        private DataInputStream din;
        private byte[] buffer, lineBuf;
        private int bufferPointer, bytesRead;

        public FastReader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public FastReader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public boolean hasNext() throws IOException {
            byte c;
            while ((c = read()) != -1) {
                if (c > ' ') {
                    bufferPointer--;
                    return true;
                }
            }
            return false;
        }
        public String nextLine() throws IOException {
            if (lineBuf == null)	lineBuf = new byte[MAX_LINE_SIZE];
            int ctr = 0;
            byte c;
            while ((c = read()) != -1) {
                if (c == '\r')        continue;
                if (c == '\n')        break;
                lineBuf[ctr++] = c;
            }
            return new String(lineBuf, 0, ctr);
        }
        public String next() throws IOException {
            if (lineBuf == null)	lineBuf = new byte[MAX_LINE_SIZE];
            int ctr = 0;
            byte c = read();
            while (c <= ' ')  	c = read();
            while (c > ' ') {
                lineBuf[ctr++] = c;
                c = read();
            }
            return new String(lineBuf, 0, ctr);
        }
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')   c = read();
            boolean neg = (c == '-');
            if (neg)           c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)           return -ret;
            return ret;
        }
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')    c = read();
            boolean neg = (c == '-');
            if (neg)            c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)            return -ret;
            return ret;
        }
        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)  	c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            if (neg)     return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)     fillBuffer();
            return buffer[bufferPointer++];
        }
        public void close() throws IOException {
            if (din == null) 	   return;
            din.close();
        }
    }
}

