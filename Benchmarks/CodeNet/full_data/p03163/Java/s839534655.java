import java.io.*; 
import java.util.*;
import java.util.Map.Entry;

public class Hey {

	

	public static void main(String[] args) throws IOException {
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int  n =Integer.parseInt(ana.nextToken()) ; 
		int siz = Integer.parseInt(ana.nextToken())  ;
		long v[]= new long[n] ; int w []=new int[n] ; 
		for(int i=0 ; i<n ;i++)
		{
			ana = new StringTokenizer(jk.readLine()) ;
			w[i] = Integer.parseInt(ana.nextToken()) ; 
			v[i]= Long.parseLong(ana.nextToken())  ;
		}
		long dp[][]= new long[n][siz+1]  ;
		for(int i=0 ;i<n ;i++)
		{
			for(int j=0 ; j<siz+1 ;j++) dp[i][j]=-1 ; 
		}
		
		dp[0][0]=0 ; dp[0][w[0]]= v[0] ; 
		for(int i=1 ; i<n ;i++)
		{
			for(int we=0 ;we<=siz ;we++ )
			{
				long y = dp[i-1][we] ; 
				if(y!=-1)
				{
					dp[i][we]= Long.max(dp[i][we], dp[i-1][we]) ;
					if(we+w[i]<=siz) dp[i][we+w[i]] = Long.max(dp[i][we+w[i]], dp[i-1][we]+v[i]) ; 
				}
			}
		}
		long res = 0 ;
		for(int j=0 ; j<=siz ;j++) res = Long.max(res, dp[n-1][j]) ;
		out.println(res);
		
		out.flush(); 
	}

}


