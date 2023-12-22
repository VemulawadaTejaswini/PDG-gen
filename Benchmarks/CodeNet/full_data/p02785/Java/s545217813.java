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


        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        long sum=0;
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        int p=n-1;
        for (int i = 0; i <k ; i++) {
            if(p>=0){
                sum-=a[p--];
            }
        }

        out.println(sum);



        out.close();
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        dp=new Integer[jobDifficulty.length+1][1010][15];
        if(jobDifficulty.length<d)return -1;
        return f(0,0,d,jobDifficulty.length,jobDifficulty);
    }

    Integer dp[][][];

    int f(int i,int max,int d,int n,int a[]){
        if(dp[i][max][d]!=null)return dp[i][max][d];
        if(i==n){
            if(d==1)return dp[i][max][d]=max;
            else return dp[i][max][d]=Integer.MAX_VALUE/2;
        }
        if(i==0){
            return dp[i][max][d]=f(i+1,a[i],d,n,a);
        }
        else{
            return dp[i][max][d]=Math.min(f(i+1,Math.max(max,a[i]),d,n,a),(d-1>=1?max+f(i+1,a[i],d-1,n,a):Integer.MAX_VALUE/2));
        }
    }


}