import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
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

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

    long modPow(long a,long p,long mod){
        long ans=1;
        while(p>0){
            ans=(ans*a)%mod;
            a=(a*a)%mod;
            p>>=1;
        }
        return ans;
    }

    long modInv(long a,long mod){
        return modPow(a,mod-2,mod);
    }

    long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }



    public void run() {
        InputReader sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        PrintWriter out = new PrintWriter(System.out);


        int h=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i = 0; i <n ; i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }

        int dp[][]=new int[n][h+1];
        for (int i = 0; i <h+1 ; i++) {
            dp[0][i]=(i/a[0][0])*a[0][1]+(i%a[0][0]>=1?a[0][1]:0);
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <h+1 ; j++) {
                dp[i][j]=dp[i-1][j];
                dp[i][j]=Math.min(dp[i][j],j-a[i][0]>=0?a[i][1]+dp[i][j-a[i][0]]:a[i][1]);
            }
        }

        out.println(dp[n-1][h]);


        out.close();
    }

    Integer dp[][];


    int f(int i,int h,int a[][]){
        if(i==a.length){
            if(h>0)return dp[i][h]=Integer.MAX_VALUE/2;
            else return dp[i][h]=0;
        }
        if(dp[i][h]!=null)return dp[i][h];
        return dp[i][h]=Math.min(f(i+1,h,a),(h-a[i][0]>=0?f(i,h-a[i][0],a)+a[i][1]:a[i][1]));
    }

}