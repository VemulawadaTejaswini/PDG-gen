
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        double arr[]=new double[n+1];
        StringTokenizer st=new StringTokenizer(in.readLine());
        for(int i=1;i<=n;i++)
            arr[i]=Double.parseDouble(st.nextToken());
        double dp[][]=new double[n+1][n+1];
        dp[0][0]=1.0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    dp[i][j]=dp[i-1][j]*(1.0-arr[i]);
                else
                    dp[i][j]=dp[i-1][j-1]*arr[i]+dp[i-1][j]*(1.0-arr[i]);
            }
        }
        double ans=0.0;
        for(int i=(n+1)/2;i<=n;i++)
            ans+=dp[n][i];
        System.out.println(ans);
    }
}
