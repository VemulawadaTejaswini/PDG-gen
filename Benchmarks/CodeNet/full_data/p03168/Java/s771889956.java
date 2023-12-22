import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      double head_pro[] = new double[n+1];
      double tail_pro[] = new double[n+1];
      for(int i=1;i<=n;i++)
      {
          head_pro[i] = sc.nextDouble();
          tail_pro[i] = 1-head_pro[i]; 
      }
      double dp[][] = new double[n+1][n+1];
      dp[0][0] = 1;
      for(int i=1;i<=n;i++)
      {
          for(int j=0;j<=n;j++)
          {
              if(i<j)
                continue;
              if(j==0)
              {
                  dp[i][j]=dp[i-1][j]*tail_pro[i];
              }
              else
              {
                  dp[i][j]=(dp[i-1][j-1]*head_pro[i])+(dp[i-1][j]*tail_pro[i]);
              }
          }
      }
      double ans = 0;
      for(int i=n;i>n/2;i--)
      {
          ans+=dp[n][i];
      }
      w.println(ans);
      w.close();
    }
}