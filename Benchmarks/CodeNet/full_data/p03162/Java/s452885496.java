//package atcoder_edu_dp;

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
/*
State: dp[i][j] (ith day and jth activity) = mat[i][j]+dp[i-1][(j-1)==0?3:(j-1)] dp[i-1][(j+1>3)?1:(j+1)]
 */
    public static void main(String[] args)
    {
        FastReader sc=new FastReader();
        int n = sc.nextInt();
        int[][] mat = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n+1][3];

        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                dp[i][j] = mat[i-1][j] + Math.max(dp[i-1][(j-1<0)?2:(j-1)],dp[i-1][(j+1>2)?0:(j+1)]);
            }
        }
        System.out.println(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));

    }
}