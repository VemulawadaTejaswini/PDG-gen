import java.util.*;
import java.io.*;
public class Main
{
    static int solve(int A[],int B[],int C[])
    {
        int dp[][] = new int[A.length][3];
        dp[0][0]=A[0];
        dp[0][1]=B[0];
        dp[0][2]=C[0];
        for(int i=1;i<A.length;i++)
        {
            dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2])+A[i];
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+B[i];
            dp[i][2]=Math.max(dp[i-1][0],dp[i-1][1])+C[i];
        }
        return Math.max(Math.max(dp[A.length-1][0],dp[A.length-1][1]),dp[A.length-1][2]);
    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int abc[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            A[i] = abc[0];
            B[i] = abc[1];
            C[i] = abc[2];
        }
        bw.write(Integer.toString(solve(A,B,C)));
        br.close();
        bw.close();
    }
}
