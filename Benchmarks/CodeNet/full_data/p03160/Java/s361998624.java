
import java.io.*;
import java.util.*;

public class Main{

    public static void solve(InputReader in, PrintWriter out) throws Exception {

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int[] dp = new int[n+1];

        dp[0]=0;
        dp[1]=0;
        dp[2]= Math.abs(arr[1]-arr[0]);

        for(int i=3;i<=n;i++)
        {
            int val1 = Math.abs(arr[i-1]-arr[i-2]) + dp[i-1];
            int val2 = Math.abs(arr[i-1]-arr[i-3]) + dp[i-2];

            dp[i]= Math.min(val1,val2);
        }

        out.println(dp[n]);

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
