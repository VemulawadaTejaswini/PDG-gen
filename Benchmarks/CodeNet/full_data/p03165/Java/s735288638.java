import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		//StringTokenizer ana = new StringTokenizer(jk.readLine()) ;

		String ss = jk.readLine() ; 
		String tt = jk.readLine()  ; 
		char[] s= ss.toCharArray() ; 
		char [] t = tt.toCharArray() ; 
		int n = s.length ; int m = t.length ; 
		int dp[][] = new int[n][m] ; 
		int pa[][] = new int[n][m] ; 
		if(s[0]==t[0]) dp[0][0]=1 ; 
		for(int i=1 ; i<n;i++)
		{
			dp[i][0]=dp[i-1][0] ; 
			if(s[i]==t[0]) dp[i][0]=Integer.min(dp[i][0]+1, 1) ;
		
		}
		for(int j=1 ; j<m ;j++)
		{
			dp[0][j]=dp[0][j-1] ; 
			if(t[j]==s[0]) dp[0][j]=Integer.min(dp[0][j]+1, 1) ;
			pa[0][j]=1 ;
		}
		for(int i=1 ; i<n ;i++)
		{
			for(int j=1 ; j<m ;j++)
			{
				if(s[i]==t[j])
				{
					dp[i][j] = dp[i-1][j-1]+ 1 ; 
				}
				else
				{
					int y = dp[i][j-1] ; int x= dp[i-1][j] ; 
					if(y>x)
					{
						dp[i][j]= y ;pa[i][j]=1 ;
					}
					else dp[i][j]=x ; 
				}
				
				 
			}
		}
		int i=n-1 ; int j = m-1 ; 
		int ans = dp[i][j] ; 
		char d[]= new char[ans] ; 
		int u = ans -1 ;
		
		while(i>0 || j>0)
		{
			if(t[j]==s[i]) 
			{
				d[u]=t[j] ;    u-- ; 	
				i-- ; j-- ; 
			}
			else
			{
				if(pa[i][j]==1) j-- ; 
				else i-- ; 
			}	
		}
		if(t[0]==s[0]) d[0]=t[0] ;
		for(int te=0 ; te<ans ;te++)
		{
			out.print(d[te]);
		}
	     

      
		out.flush();
	}
}

