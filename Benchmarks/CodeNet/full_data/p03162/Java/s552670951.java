import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String [] args){
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        int[][] activities = new int[n][];
        for (int i = 0; i < n; i++) {
            activities[i] = new int [] {reader.nextInt(), reader.nextInt(), reader.nextInt()};
        }
        int [][] dp = new int [n][3];
        dp[0] = activities[0];
        for (int i = 1; i < n; i++) {
            int a = dp[i - 1][0];
            int b = dp[i - 1][1];
            int c = dp[i - 1][2];
            dp[i][0] = Math.max(b, c) + activities[i][0];
            dp[i][1] = Math.max(a, c) + activities[i][1];
            dp[i][2] = Math.max(b, a) + activities[i][2];
        }

        System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
