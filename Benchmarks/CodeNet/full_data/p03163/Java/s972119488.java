import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) {
        FastReader fr = new FastReader();
        int N = fr.nextInt(), W = fr.nextInt();
        int [][] input = new int [N][2];
        for (int i = 0; i < N; i++) {
            input[i][0] = fr.nextInt();
            input[i][1] = fr.nextInt();
        }
        long [] dp = new long [W + 1];
        long [] prev = new long [W + 1];
        for (int i = 0; i < N; i++) {
            int w = input[i][0], v = input[i][1];
            for (int j = 1; j <= W; j++) {
                if (w <= j) {
                    dp[j] = Math.max(dp[j], prev[j - w] + v);
                }
                dp[j] = Math.max(dp[j], dp[j - 1]);
            }
            prev = dp.clone();
        }

        System.out.println(dp[W]);
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
