import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastReader in  = new FastReader(); 
        Solver s = new Solver();
        int t = 1;
        while(t-- > 0) s.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(FastReader in, PrintWriter out) throws IOException {
            // solve
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=in.nextInt();
            int[] dp=new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0]=0;
            for(int i=1;i<n;i++){
                if(i-1>=0) dp[i]=Math.min(dp[i], dp[i-1]+Math.abs(a[i]-a[i-1]));
                if(i-2>=0) dp[i]=Math.min(dp[i], dp[i-2]+Math.abs(a[i]-a[i-2]));
            }
            out.println(dp[n-1]);
        } 
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char nextChar() {
            return next().charAt(0);
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
    }
}