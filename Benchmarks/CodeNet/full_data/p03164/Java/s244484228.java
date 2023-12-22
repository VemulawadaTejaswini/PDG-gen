
import java.io.*;
import java.util.*;

public class Main {

    public static void solve(InputReader in, PrintWriter out) throws Exception {


        int n = in.nextInt(),w = in.nextInt();

        int[] values = new int[n];
        long[] weights = new long[n];

        for(int i=0;i<n;i++)
        {
            weights[i]=in.nextInt();
            values[i]=in.nextInt();
        }

        long[][] dp = new long[n+1][100005];


        long ans =0;

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<100005;j++)
            {
                if(i==0 || j==0) {

                    if(j==0)
                        dp[i][j]=0;
                    else
                    dp[i][j] = Long.MAX_VALUE;

                    continue;
                }

                if(j>=values[i-1] && dp[i-1][j-values[i-1]]!=Long.MAX_VALUE)
                dp[i][j] = Math.min(dp[i-1][j], weights[i-1]+ dp[i-1][j-values[i-1]]);

                else
                    dp[i][j]=dp[i-1][j];

                if(dp[i][j]<=w)
                    ans = Math.max(ans,j);
            }
        }

        out.println(ans);
    }

    /////////////////////////////////////////////////////////


    private final static long hash(long x, long y) {
        x += offset;
        y += offset;
        return x << 32 | y;
    }

    private final static int offset = (int) 3e5;

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String nextToken() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(nextToken());
        }

    }
}