import java.util.*;
 
 
import java.io.*;
 
 
 
public class Main 
{   
	
	
	public static void main(String[] args) throws IOException 
	{ 
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		StringTokenizer s=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken());
		s=new StringTokenizer(br.readLine());
		long ar[]=new long[n];
		for(int i=0;i<n;i++) {
			ar[i]=Integer.parseInt(s.nextToken());
		}
		
		long sum[][]=new long[n][n];
		sum[0][0]=ar[0];
		for(int i=1;i<n;i++) {
			sum[0][i]=sum[0][i-1]+ar[i];
		}
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum[i][j]=sum[i-1][j]-sum[i-1][i-1];
			}
		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++)
//				pw.print(sum[i][j]+" ");
//			pw.println();
//		}
			
		long dp[][]=new long[n][n];
		for(int i=n-1; i>=0; i--)
	    {
	        for(int j=i; j<n; j++)
	        {
	            if(i == j)
	            {
	                continue;
	            }
	 
	            else
	            {
	                dp[i][j] = (long) 1e18;
	 
	                for(int k=i; k<j; k++)
	                {
	                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + sum[i][j]);
	                }
	            }
	        }
	    }
		
		pw.print(dp[0][n-1]);
		
		pw.close();
		
	}
	
	
	
}