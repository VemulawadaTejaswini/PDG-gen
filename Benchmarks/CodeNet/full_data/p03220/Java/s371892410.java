/*
The year is 2050, league is played by less than 100 people. T1 has finally reached Masters,
"Macaiyla I did it!" he yells excitedly. The sound echoes through the empty trailer. Macaiyla left long ago...
 */
import java.io.*;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        final int MOD = 1000000007;

        int n = sc.nextInt();
        int t = sc.nextInt();
        double a = sc.nextDouble();
        double min = Double.MAX_VALUE;
        int idx = 0;

        for(int i=0;i<n;i++) {
            double cur = t - (0.006 * sc.nextDouble());
            double diff = Math.abs(cur - a);
            if(diff < min) {
                min = diff;
                idx = i + 1;
            }
        }

        pw.println(idx);
        pw.close();
    }
}

// ceil(a/b) = (a+b-1)/b
// PRO TIP: THE BEST ANSWER IS THE RIGHT ANSWER
