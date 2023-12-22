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

    long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }



    PrintWriter out;
    InputReader sc;

    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);

        /*

        logic is taken from : https://codeforces.com/profile/pigeon_hole

        * we can maintain dp[i][j], j = {0,1}

Initially dp[2][1] = arr[2] and dp[2][0] = arr[1] (Base Case)

1. dp[i][1] denotes maximum sum when we are at i and we are picking ith element and floor(i / 2) elements(subset of 1...i such that adjacent element are not picked).

2. dp[i][0] denotes maximum sum when we are at i and we are NOT picking ith element and floor(i / 2) elements (subset of 1...(i — 1) such that adjacent element are not picked)

With some work we can fill dp upto n.
        * */

        int n=sc.nextInt();
        long a[]=new long[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=sc.nextLong();
        }
        long dp[][]=new long[n+1][2];
        dp[2][0]=a[1];
        dp[2][1]=a[2];
        long pre=a[1];
        for (int i = 3; i <=n ; i++) {
            if(i%2==1){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
                dp[i][1]=a[i]+Math.max(dp[i-2][0],dp[i-2][1]);
            }
            else{
                dp[i][0]=pre;
                dp[i][1]=a[i]+Math.max(dp[i-2][0],dp[i-2][1]);
            }
            if(i%2==1)pre+=a[i];
        }
        out.println(Math.max(dp[n][0],dp[n][1]));

        out.close();
    }



}