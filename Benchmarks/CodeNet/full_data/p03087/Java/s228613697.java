//Atcoder
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

        int n = sc.nextInt(), m = sc.nextInt();
        String str = sc.nextLine();
        int[] cnt = new int[n];

        for(int i=1;i<n;i++) {
            cnt[i] = cnt[i-1];
            if(str.charAt(i) == 'C' && str.charAt(i-1) == 'A') {
                cnt[i]++;
            }
        }

        //pw.println(Arrays.toString(cnt));

        for(int i=0;i<m;i++) {
            int l = sc.nextInt() - 1, r = sc.nextInt() - 1;
            pw.println(cnt[r] - cnt[l]);
        }

        pw.close();
    }
}
