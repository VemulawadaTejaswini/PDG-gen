import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt(),m=s.nextInt(); s.nextLine();
       int[][] arr=new int[n+1][m+1];
       for(int i=1;i<=n;i++){
        char[] r=s.nextLine().toCharArray();
        for(int j=1;j<=m;j++){
          if(r[j-1]=='#'){arr[i][j]=-1;}
        }
       }
       long mod=(long)1e9+7;
       long[][] dp=new long[n+1][m+1];

       for(int i=1;i<=m;i++){
        if(arr[1][i]==-1){break;}
        dp[1][i]=1;
       }
       for(int i=1;i<=n;i++){
        if(arr[i][1]==-1){break;}
        dp[i][1]=1;
       }

       for(int i=2;i<=n;i++){
        for(int j=2;j<=m;j++){
          if(arr[i-1][j]!=-1){
            dp[i][j]=(dp[i][j]+dp[i-1][j])%mod;
          }
          if(arr[i][j-1]!=-1){
            dp[i][j]=(dp[i][j]+dp[i][j-1])%mod;
          }

        }
       }

       System.out.println(dp[n][m]%mod);
        }
    }
