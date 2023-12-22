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

        int m = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;
        for(int i=10;i<=d;i++) {
            int d1 = i / 10;
            int d10 = i % 10;
            if(d1 >= 2 && d10 >= 2 && d1 * d10 <= m) cnt++;
        }

        pw.println(cnt);
        pw.close();
    }
}

// ceil(a/b) = (a+b-1)/b
// PRO TIP: THE BEST ANSWER IS THE RIGHT ANSWER

