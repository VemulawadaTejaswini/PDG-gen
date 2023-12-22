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

        int n = sc.nextInt();
        int[] h = new int[n];
        int[] max = new int[n];
        int best = 0;
        for(int i=0;i<n;i++) {
            h[i] = sc.nextInt();
            if(h[i] > best) best = h[i];
            max[i] = best;
        }

        //pw.println(Arrays.toString(h));
        //pw.println(Arrays.toString(max));

        int ans = 0;
        for(int i=n-1;i>0;i--) {
            if(h[i] >= max[i-1]) {
                ans++;
            }
        }

        pw.println(ans+1);
        pw.close();
    }
}
