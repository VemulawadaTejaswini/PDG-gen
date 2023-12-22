import java.util.*;
import java.io.*;
public class Main
{
    static long solve(String[] input)
    {
        long dp[][] = new long[input.length][input[0].length()];
        for(int i=0;i<input.length;i++)
        {
            if(input[i].charAt(0)=='#')
            break;
            dp[i][0]=1;
        }
        for(int i=0;i<input[0].length();i++)
        {
            if(input[0].charAt(i)=='#')
            break;
            dp[0][i]=1;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++){
                if(input[i].charAt(j)=='#')
                    dp[i][j] = 0;
                else
                    dp[i][j] = (dp[i-1][j]+dp[i][j-1])%1000000007;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int hw[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input[] = new String[hw[0]];
        for(int i=0;i<hw[0];i++)
            input[i] = br.readLine();
        bw.write(Long.toString(solve(input)));
        br.close();
        bw.close();
    }
}
