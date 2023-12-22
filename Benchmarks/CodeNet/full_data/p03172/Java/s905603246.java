
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static int mod = (int)1e9+7;
    public static void main(String[] args) {

        FastReader f = new FastReader();
        int n =f.nextInt();
        int k = f.nextInt();
        int candies [] = new int[n];
        for(int i=0;i<n;i++)
            candies[i] =f.nextInt();
        System.out.println(solve(candies,n,k));



    }

    static int solve(int[] candies ,int n,int k)
    {
        int dp[][] = new int[n+1][k+1];
        dp[0][0] =1;
        int[] ways  =new int[k+1];

        for(int i=1;i<=n;i++) {
            dp[i][0]=1;
        }

        for(int i=1;i<=n;i++)
        {
            ways[0] =dp[i-1][0];
            for(int j=1;j<=k;j++)
            {
                ways[j] =  ways[j-1]+dp[i-1][j];
                if (ways[j] >mod)
                    ways[j]-=mod;
            }
            for(int j=1;j<=k;j++)
            {
                 dp[i][j] += ways[j]-((j-candies[i-1]-1) >=0?ways[j-candies[i-1]-1]:0);
                 if (dp[i][j]<0)
                     dp[i][j]+=mod;
            }
        }
//        for(int i=0;i<=n;i++)
//        {
//            System.out.println();
//            for(int j=0;j<=k;j++)
//            {
//                System.out.print(dp[i][j]+" ");
//            }
//
//        }


        return dp[n][k];
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
