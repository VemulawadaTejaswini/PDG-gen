
/*
stones numbered 1-n
ith stone has height hi
from ith stone can jump to i+1 or i+2 with cost |diff(stone j - stone i)|
find min cost to go from i to n

Approach =
state : dp[i] = min(dp[i-1]+(h[i]-h[i-1]) or dp[i-2]+(h[i]-h[i-2]))
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
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
                catch (IOException  e)
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

    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = Math.abs(h[1]-h[0]);
        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]),dp[i-2]+Math.abs(h[i]-h[i-2]));
        }
        System.out.println(dp[n-1]);
    }
}
