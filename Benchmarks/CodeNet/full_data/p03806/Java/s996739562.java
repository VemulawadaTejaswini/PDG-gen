import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();

        n = fs.nextInt(); a = fs.nextInt(); b = fs.nextInt();
        dp = new int[500][500][40];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        c = new Pack[n];
        for(int i = 0; i < n; i++) c[i] = new Pack(fs.nextInt(), fs.nextInt(), fs.nextInt());
        int res = solve(0, 0, 0, 0);
        if(res == (int)1e9) out.println("-1");
        else out.println(res);

        out.close();
    }

    static class Pack {
        int a, b, c;
        public Pack(int A, int B, int C) {
            a = A; b = B; c = C;
        }
    }

    static int[][][] dp;
    static int n, a, b;
    static Pack[] c;

    static int solve(int at, int cost, int A, int B) {
        if(at == n) {
            double abc = A, bcd = B;
            if(abc / bcd != (double)a/b) {
                return (int)1e9;
            }
            return cost;
        }
        if(dp[A][B][at] != -1) return dp[A][B][at];
        int res = (int)1e9;
        //include
        res = Math.min(res, solve(at+1, cost + c[at].c, A + c[at].a, B + c[at].b));
        //exclude
        res = Math.min(res, solve(at+1, cost, A, B));

        return dp[A][B][at] = res;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try	{
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer("");
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens())	return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            try {line = br.readLine();}
            catch (Exception e) {e.printStackTrace();}
            return line;
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public char[] nextCharArray() {
            return nextLine().toCharArray();
        }
    }
}