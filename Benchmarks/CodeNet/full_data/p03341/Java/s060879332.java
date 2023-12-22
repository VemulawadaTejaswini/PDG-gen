import java.io.*;
import java.util.*;
import java.lang.Math;

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
        char[] c = sc.nextLine().toCharArray();
        int[][] cnt = new int[n][2]; // cnt[i][0] = # west, cnt[i][1] = # east

        if(c[0] == 'W') cnt[0][0]++;
        else cnt[0][1]++;

        for(int i=1;i<n;i++) {
            if(c[i] == 'W') cnt[i][0]++;
            else cnt[i][1]++;
            cnt[i][0] += cnt[i-1][0];
            cnt[i][1] += cnt[i-1][1];
        }

        int ans = n - 1;
        for(int i=0;i<n;i++) {
            int idx;
            if(c[i] == 'E') idx = 1;
            else idx = 0;
            cnt[i][idx]--;
            /*pw.println("i:" + i);
            pw.println("change to east: " + cnt[i][0]);
            pw.println("change to west: " + (cnt[n-1][1] - cnt[i][1]));*/
            ans = Math.min(ans, cnt[i][0] + (cnt[n-1][1] - cnt[i][1]));
            cnt[i][idx]++;
        }

        pw.println(ans);
        pw.close();
    }
}
