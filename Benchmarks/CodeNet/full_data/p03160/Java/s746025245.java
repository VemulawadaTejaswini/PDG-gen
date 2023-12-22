import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        //out.print("AMan");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp,(int)1e9+7);
        dp[0]=0;
        for(int i=0;i<n;i++) {
            if(i+1<n) dp[i+1] = Math.min(dp[i+1],dp[i]+Math.abs(a[i+1]-a[i]));
            if(i+2<n) dp[i+2] = Math.min(dp[i+2],dp[i]+Math.abs(a[i+2]-a[i]));
        }
        out.println(dp[n-1]);

        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}