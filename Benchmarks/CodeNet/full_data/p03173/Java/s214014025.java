

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) {
        FastReader reader = new FastReader();

        int n = reader.nextInt();
        int [] a = new int [n];
        long [] sum = new long [n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
            sum [i + 1] = sum [i] + a[i];
        }

        long [][] dp = new long [n][n];
        // dp[i][j] -> minimum cost to merge interval i,j

        for (int L = n - 1; L >=0; L--) {
            for (int R = L + 1; R < n; R++) {
                dp [L][R] = Long.MAX_VALUE;
                for (int i = L; i < R; i++) {
                    dp[L][R] = Math.min(dp[L][R], dp[L][i] + dp[i + 1][R] + (sum[R + 1] - sum[L]));
                }
            }
        }

        System.out.println(dp[0][n - 1]);

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
