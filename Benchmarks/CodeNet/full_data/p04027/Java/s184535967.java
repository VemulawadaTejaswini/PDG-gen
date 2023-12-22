import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;




public class Main {
	  static int MOD=1000000007;
	  static long p[][]=new long[405][405];
	  static long sum[][]=new long[405][405];
	  static long dp[][]=new long[405][405];
	  static long a[]=new long[405];
	  static long b[]=new long[405];
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
    
    	  
    	  for(int i=1;i<=404;i++)//p[i][j]=i^j
    	  {
    		  p[i]= new long[405];
    		  p[i][0]=1;
    		  for(int j=1;j<=404;j++)
    		  {
    			  p[i][j]=(p[i][j-1]*i)%MOD;
    		  }
    	  }
    	 
    	  for(int i=1;i<=404;i++)//sum[i][j] 1^j+...+i^j
    	  {
    		  sum[i]=new long[405];
    		 
    		  for(int j=0;j<=404;j++)
    		  {
    			  sum[0][j]=0;
    			  sum[i][j]=(sum[i-1][j]%MOD+p[i][j]%MOD)%MOD;
    		  }
    	  }
    	  int n=in.nextInt();
    	  int m=in.nextInt();
    	  
    	  for(int i=1;i<=n;i++)
    	  {
    		  a[i]=in.nextLong();
    	  }
    	  for(int i=1;i<=n;i++)
    	  {
    		  b[i]=in.nextLong();
    	  }
    	  
    	  dp[0][0]=1;
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=0;j<=m;j++)
    		  {
    			  for(int k=0;k<=j;k++)
    			  {
    				  long temp=(sum[(int) b[i]][k]%MOD-sum[(int) (a[i]-1)][k]%MOD+MOD)%MOD;
    				  dp[i][j]=(dp[i][j]%MOD+dp[i-1][j-k]*temp%MOD)%MOD;
    			  }
    		  }
    	  }
    	  System.out.println(dp[n][m]);
    	  return;
      }
}
