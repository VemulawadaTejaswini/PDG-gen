import java.util.*;
import java.io.*;
public class Main
{
    static long solve(int weight[],int value[],int w)
    {
        long dp[][] = new long[weight.length][w+1];
        for(int i=0;i<=w;i++)
        {
            if(weight[0]<=i)
            dp[0][i] = value[0];
        }
        for(int i=1;i<weight.length;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(j-weight[i]>=0)
                dp[i][j] = Math.max(dp[i-1][j-weight[i]]+value[i],dp[i-1][j]);
                else
                dp[i][j] = dp[i-1][j];
            }
        }
        return dp[weight.length-1][w];
    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int nw[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int weight[] = new int[nw[0]];
        int value[] = new int[nw[0]];
        for(int i=0;i<nw[0];i++)
        {
            int wv[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            weight[i] = wv[0];
            value[i] = wv[1];
        }
        bw.write(Long.toString(solve(weight,value,nw[1])));
        br.close();
        bw.close();
    }
}
