import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        int H,W,mod=1000000007;
        Scanner in=new Scanner(System.in);
        H=in.nextInt();
        W=in.nextInt();
        char[][]grid=new char[H][W];
        int[][]dp=new int[H][W];
        String s=new String();
        for(int i=0;i<H;i++){
          s=in.next();
          for(int j=0;j<W;j++){
            grid[i][j]=s.charAt(j);
          }
        }
        dp[0][0]=grid[0][0]=='#'?0:1;
        for(int i=1;i<H;i++){
          if(grid[i][0]=='#')dp[i][0]=0;
          else dp[i][0]=dp[i-1][0];
        }
        for(int i=1;i<W;i++){
          if(grid[0][i]=='#')dp[0][i]=0;
          else dp[0][i]=dp[0][i-1];
        }
        for(int i=1;i<H;i++){
          for(int j=1;j<W;j++){
            if(grid[i][j]=='#')dp[i][j]=0;
            else dp[i][j]=(dp[i-1][j]%mod+dp[i][j-1]%mod)%mod;
          }
        }
        System.out.println(dp[H-1][W-1]);
    }
}

