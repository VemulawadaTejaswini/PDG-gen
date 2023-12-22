
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int mod = (int)1e9+7;

    public static void main(String[] args) {

        FastReader f = new FastReader();
        int n =f.nextInt();
        int[][] mat= new int[n][n];

        for(int i=0;i<n;i++)
         for(int j=0;j<n;j++)
         {
             mat[i][j] = f.nextInt();

         }
        int mask = (int)Math.pow(2,n)-1;
        int dp[]= new int[mask+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        System.out.println(solve(mask,0,dp,mat));

    }

    static int solve(int m,int i,int dp[],int mat[][])
    {

        if(dp[m]!=0)
            return dp[m];

        else
        {
            int temp=0;
            for(int j=0;j<mat.length;j++)
            {
                if((m&(1<<j))!=0 && mat[i][j]==1)
                {
                    temp+=solve(m^(1<<j),i+1,dp,mat);
                    if(temp>mod)
                        temp-=mod;
                    dp[m] =temp;
                }
            }
        }
        return dp[m];

    }




    static  class FastReader
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
