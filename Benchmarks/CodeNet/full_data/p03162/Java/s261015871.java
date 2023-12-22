
import java.io.*;
import java.util.*;

public class Main {

    public static void solve(InputReader in, PrintWriter out) throws Exception {

        int n = in.nextInt();

        int[] arr = new int[n];

        int[][] val = new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
            val[i][j]=in.nextInt();


        int[][] dp = new int[n+1][4];

        for(int i=0;i<=n;i++) {
            for (int j = 0; j < 4; j++) {

                if(i==0||j==0)
                {
                    dp[i][j]=0;
                    continue;
                }

                dp[i][j]=0;

                if(j==1)
                    dp[i][1]=Math.max(val[i-1][j-1]+dp[i-1][2],val[i-1][j-1]+dp[i-1][3]);
                else if(j==2)
                    dp[i][2]=Math.max(val[i-1][j-1]+dp[i-1][1],val[i-1][j-1]+dp[i-1][3]);
                else if(j==3)
                    dp[i][3]=Math.max(val[i-1][j-1]+dp[i-1][1],val[i-1][j-1]+dp[i-1][2]);
            }

        }

        out.println(Math.max(dp[n][3],Math.max(dp[n][1],dp[n][2])));

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
