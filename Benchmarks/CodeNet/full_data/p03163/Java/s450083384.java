
import java.math.*;
import java.util.*; import java.io.*;
/*
 * untitled.java
 * Copyright 2019 Karan Kanojia <karankanojia@Karans-MacBook-Air.local>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */

public class Main implements Runnable{

    static DusroKiBike scan = new DusroKiBike(System.in);
    static Scanner scanner = new Scanner(System.in);
    static StringBuffer stringBuffer = new StringBuffer();
    static PrintWriter out  = new PrintWriter(System.out);
    static int MAX = 1111111111;
    static int bit_max = 32;
    static int ALPHA_LIMIT = 30;
    static int  SQRT_BUCKET = 555;
    static int lim = 1000000007;
    static long watcher = 0;
    static void inputL(int n, long[] arr) {
        for(int i=0; i<n; i++){
            arr[i] = scan.nextLong();
        }
    }
    static void inputI(int n, int[] arr) {
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
    }
    static int upper_bound(int left, int right, long[] arr, long key){
        if(left == right){
            if(arr[left] >= key){
                return left;
            }
            return -202;
        }else if(right-left == 1){
            if(arr[left] >= key){
                return left;
            }
            if(arr[right] >= key){
                return right;
            }
            return -202;
        }else{
            int mid = (left+right)/2;
            if(arr[mid] >= key){
                return upper_bound(left, mid, arr, key);
            }else{
                return upper_bound(mid+1, right, arr, key);
            }
        }
    }
    static int lower_bound(int left, int right, long[] arr, long key){
        if(left == right){
            if(arr[left] <= key){
                return left;
            }
            return -202;
        }else if(right-left == 1){
            if(arr[right] <= key){
                return right;
            }
            if(arr[left] <= key){
                return left;
            }
            return -202;
        }else{
            int mid = (left+right)/2;
            if(arr[mid] <= key){
                return lower_bound(mid, right, arr, key);
            }else{
                return lower_bound(left, mid-1, arr, key);
            }
        }
    }


    static HashMap<String, Long> dp;
    static long compute(int[] val, int[] wei, int index, int weight){
        int n = val.length, m = weight+1;
        long[][] dp = new long[n][m];
        for(int i=0; i<n; i++){
            int v = val[i], w = wei[i];
            for(int j=1; j<m; j++){
                if(i == 0){
                    dp[i][j] = 0;
                    if(j-w >= 0){
                        dp[i][j] = Long.max(dp[i][j], v);
                    }
                }else{
                    dp[i][j] = dp[i-1][j];

                    if(j-w >= 0){
                        dp[i][j] = Long.max(dp[i][j], v+dp[i-1][j-w]);
                    }
                }
            }
        }

        return dp[n-1][m-1];
    }


    @Override
    public void run() {

        int t = 1;
        while(t-->0){
            int n = scan.nextInt();
            int weight = scan.nextInt();
            int[] val = new int[n];
            int[] wei = new int[n];
            dp = new HashMap<>();
            for(int i=0; i<n; i++){
                wei[i] = scan.nextInt();
                val[i] = scan.nextInt();
            }
            long answer = compute(val, wei, 0, weight);
            out.println(answer);
        }

        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, new Main(), "Main", 1<<26).start();
    }


    static class DusroKiBike {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public DusroKiBike(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }


}