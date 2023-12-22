import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int M = ((int)1e9) + 7;
      int r = sc.nextInt();
      int c = sc.nextInt();
      char arr[][]=new char[r][c];
      for(int i=0;i<r;i++)
      {
          arr[i] = sc.next().toCharArray();
      }
      int dp[][] = new int[r][c];
      dp[0][0]=1;
      for(int i=1;i<r;i++)
      {
          if(arr[i][0] == '#')
          {
              dp[i][0] = 0;
          }
          else
          {
              dp[i][0] = dp[i-1][0];
          }
      }
      for(int j=1;j<c;j++)
      {
          if(arr[0][j] == '#')
          {
              dp[0][j] = 0;
          }
          else
          {
              dp[0][j] = dp[0][j-1];
          }
      }
      for(int i=1;i<r;i++)
      {
          for(int j=1;j<c;j++)
          {
              if(arr[i][j]=='#')
              {
                  dp[i][j]=0;
              }
              else
              {
                  dp[i][j]=(dp[i-1][j]%M+dp[i][j-1]%M)%M;
              }
          }
      }
      w.println(dp[r-1][c-1]);
      w.close();
    }
}