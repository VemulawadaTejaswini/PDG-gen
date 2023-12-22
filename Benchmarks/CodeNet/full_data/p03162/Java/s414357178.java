import java.io.*;
import java.util.*;

import javax.print.attribute.HashAttributeSet;


public class Main {


	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n = Integer.parseInt(ana.nextToken()) ; 
		
		int t[]= new int[n] ;             
		int a[] = new int[n] ; 	int b[] = new int[n] ;  int c[] = new int[n] ;
	
		for(int i=0 ; i<n ;i++)
		{
			ana = new StringTokenizer(jk.readLine()) ;
			a[i] = Integer.parseInt(ana.nextToken()) ;  b[i] = Integer.parseInt(ana.nextToken()) ;  c[i] = Integer.parseInt(ana.nextToken()) ; 
		}
		int dp[]= new int[n] ;
		int lastused[][] = new int[n][3] ; 
		int max = Integer.max(Integer.max(a[0], b[0]), c[0]) ; 
		dp[0]= max; 
	
		if(max==a[0])lastused[0][0]=2 ; 
		if(max==b[0])lastused[0][1]=3 ; 
		if(max==c[0])lastused[0][2]=7 ; 
	
		Set<Integer>s = new HashSet<>() ; s.add(2) ; s.add(3) ; s.add(7) ;
		for(int i=1 ; i< n;i++)
		{
			
			int sum = 0 ; 
			for(int j=0 ; j<3 ;j++) sum+=lastused[i-1][j] ;
			if(!s.contains(sum))
			{
		
				max = Integer.max(Integer.max(a[i], b[i]), c[i]) ;
				dp[i] =max+dp[i-1] ; 
				if(max==a[i])lastused[i][0]=2 ; 
				if(max==b[i])lastused[i][1]=3 ; 
				if(max==c[i])lastused[i][2]=7 ;
			
			}
			else
			{
				int d = 0 ; 
				if(lastused[i-1][0]==2)
				{
					d=Integer.max(b[i], c[i]) ; 
					dp[i] = dp[i-1]+ d ; 
					if(d==b[i])lastused[i][1]=3 ; 
					if(d==c[i])lastused[i][2]=7 ; 
				}
				else if(lastused[i-1][1]==3)
				{
					d=Integer.max(a[i], c[i]) ; 
					dp[i] = dp[i-1]+ d ; 
					if(d==a[i])lastused[i][0]=2 ; 
					if(d==c[i])lastused[i][2]=7 ; 
				}
				else
				{
					d=Integer.max(b[i], a[i]) ; 
					dp[i] = dp[i-1]+ d ; 
					if(d==b[i])lastused[i][1]=3 ; 
					if(d==a[i])lastused[i][0]=2 ; 
				}

			}

		}

          out.println(dp[n-1]);















		out.flush();
	}
}

