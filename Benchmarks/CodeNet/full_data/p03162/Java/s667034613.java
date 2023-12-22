// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

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

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt(); b[i] = sc.nextInt(); c[i] = sc.nextInt();
        }

        int[][] dp = new int[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];

        for(int i=1;i<n;i++) {
            dp[i][0] = Math.max(dp[i-1][1] + a[i], dp[i-1][2] + a[i]);
            dp[i][1] = Math.max(dp[i-1][0] + b[i], dp[i-1][2] + b[i]);
            dp[i][2] = Math.max(dp[i-1][0] + c[i], dp[i-1][1] + c[i]);
        }

        pw.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
        pw.close();
	}

}