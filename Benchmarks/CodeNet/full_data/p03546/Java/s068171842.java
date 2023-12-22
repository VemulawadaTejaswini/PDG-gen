
    import javax.xml.crypto.Data;
    import java.math.BigDecimal;
    import java.util.*;
    import java.io.*;

    public class Main {

        public static int INF = 10000007;
        public static int[] cost = new int[10];
        public static int[][] c = new int[10][10];
        public static boolean[] vis = new boolean[10];

        public static void main(String[] args) throws IOException {

            //入力
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FastScanner sc = new FastScanner();
            int H = sc.nextInt();
            int W = sc.nextInt();
            for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) c[i][j] = sc.nextInt();
            int[][] A = new int[H][W];
            for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) A[i][j] = sc.nextInt();

            //出力
            for (int i = 0; i < 10; i++) cost[i] = INF;
            cost[1] = 0;
            dfs(1);
            int ans = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (A[i][j] != -1 && A[i][j] != 1) ans += cost[A[i][j]];
                }
            }
            System.out.println(ans);
        }

        public static void dfs(int n) {
            vis[n] = true;
            for (int i = 0; i < 10; i++) {
                if (!vis[i]) cost[i] = Math.min(cost[i], cost[n] + c[i][n]);
            }
            boolean sign = false;
            int next = 0;
            for (int i = 0; i < 10; i++) {
                if (!vis[i]) {
                    sign = true;
                    next = i;
                    break;
                }
            }
            if (!sign) return;
            for (int i = 0; i < 10; i++) {
                if (vis[i]) continue;
                if (cost[next] > cost[i]) next = i;
            }
            dfs(next);
        }
    }


    class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
