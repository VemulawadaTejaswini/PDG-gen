import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve() {
        int n = in.nextInt();
        int a = in.nextInt();

        int[] x = new int[n+1];
        for(int i=1;i<=n;i++){
            x[i] = in.nextInt();
        }

        long[][] dp = new long[51][2551];

        dp[0][0]=1;
        int tot =0;
        for (int i=1;i<=n;i++){
            for(int j = i-1;j>=0;j--){
                for(int k = tot;k>=0;k--){
                    dp[j+1][k+x[i]]+=dp[j][k];
                }
            }
            tot+=x[i];
        }
        long cnt =0;
        for(int i=1;i<=n;i++){
            cnt+=dp[i][a*i];
        }
        out.print(cnt);
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }

    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
