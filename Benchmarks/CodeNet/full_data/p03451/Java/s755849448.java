/**
 * Created by Aminul on 1/28/2018.
 */

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextInt();
        a = new int[3][n+1];
        dp = new int[3][n+1];
        for (int i = 1; i <= n; i++) {
            a[1][i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[2][i] = in.nextInt();
        }

        for(int d[] : dp) Arrays.fill(d, -1);

        pw.println(solve(1, 1));

        pw.close();
    }

    static int dp[][], a[][], n;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};

    static boolean check(int x, int y){
        return x >= 1 && x <= 2 && y >= 1 && y <= n;
    }

    static int solve(int x, int y){
        if(!check(x, y)) return 0;
        int ans = a[x][y];
        if(x == 2 && y == n) return ans;
        if(dp[x][y] != -1) return dp[x][y];
        int max = Math.max(solve(x, y+1), solve(x+1, y));
        return dp[x][y] = ans + max;
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;
        static final int ints[] = new int[128];

        public FastReader(InputStream is){
            for(int i='0';i<='9';i++) ints[i]=i-'0';
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
                if(lenbuf <= 0)return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while((b = readByte()) != -1 && isSpaceChar(b));
            return b;
        }

        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt(){
            int num = 0, b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
       /* public char nextChar() {
            return (char)skip();
        }*/

        public char[] next(int n){
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while(p < n && !(isSpaceChar(b))){
                buf[p++] = (char)b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        /*private char buff[] = new char[1005];
        public char[] nextCharArray(){
            int b = skip(), p = 0;
            while(!(isSpaceChar(b))){
                buff[p++] = (char)b;
                b = readByte();
            }
            return Arrays.copyOf(buff, p);
        }*/
    }
}