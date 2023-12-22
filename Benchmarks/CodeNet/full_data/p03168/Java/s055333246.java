import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import java.util.List;
/**
 * Using FastReader and Output Class
 *
 * @author Wallace
 */
   class Main {
    static int parent[]=new int[26];
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        IAMBACK solver = new IAMBACK();
        solver.solve(1, in, out);
        out.close();
    }
    static class IAMBACK {
        static long mod=100000007;
        double result=0;
        public void solve(int testNumber, FastReader in, PrintWriter out) {
           int n=in.nextInt();
           double a[]=new  double[n];
           for(int i=0;i<n;i++){
               a[i]=Double.parseDouble(in.nextString());
           }
           double ans[][]=new double[n+1][n+1];
           out.println(helper1(a,n,n+1,ans));
        //    for(int i=0;i<=n;i++)
        //    out.println(Arrays.toString(ans[i]));
           // out.println(res);
        }

        public double helper1(double a[],int ncoins,int numheads,double ans[][]){
            if(numheads-1<=a.length/2)
            return 0;
            //System.out.println(numheads);
            double smallans=helper(a, ncoins, numheads-1, ans);
           // System.out.println("hahaha "+smallans);
            return  smallans+ helper1(a, ncoins, numheads-1, ans);

        }
        public double helper(double a[],int ncoins,int numheads,double ans[][]){
                if(numheads>ncoins)
                return 0;
               if(numheads==0 && ncoins==1){
                return ans[ncoins][numheads]=1-a[0];
               }
               if(numheads==1 && ncoins==1){
                    return ans[ncoins][numheads]=a[0];
               }
                if(ans[ncoins][numheads]>0)
                return ans[ncoins][numheads];  
                double samecoinsheadoneless=0,onelesscoinsheadoneless=0;
                if(numheads-1>=0)
                 samecoinsheadoneless=helper(a, ncoins-1, numheads-1,ans);   //heads call
                 onelesscoinsheadoneless=helper(a, ncoins-1, numheads,ans);  //tails call
                samecoinsheadoneless=samecoinsheadoneless*a[ncoins-1];
                onelesscoinsheadoneless=onelesscoinsheadoneless*(1-a[ncoins-1]);
                double result= samecoinsheadoneless+onelesscoinsheadoneless;
                ans[ncoins][numheads]=result;
                return result;
        }

       


    }
    // for the fastreader
    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String next() {
            return nextString();
        }

        public String nextString() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = pread();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String[] nextStringArray(int n)
        {
            String array[]=new String[n];
            for(int i=0;i<n;i++)
            {
                array[i]=nextString();
            }
            return array;
        }
        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
            }
            return array;
        }

        // pcwallace
        public double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        public long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        public int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        public long nextLong() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            double res = 0.0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}