import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main
{
	static ArrayList<ArrayList<Integer>> tr =new ArrayList<>() ;
	static long dp[] ,sl[] ,fct[] ,md =1000000007l ;	static int n ,sz[] ;
	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 	
		int i ,j ,k ;	n =fr.nextInt() ;	sz =new int[n] ;	dp =new long[n] ;	sl =new long[n] ;	fct =new long[n] ;
		for (i =0 ; i<n ; ++i) {
			dp[i] =sz[i] =1 ;	tr.add (new ArrayList<>()) ;
		}
		fct[0] =1l ;
		for (i =1 ; i<n ; ++i) {
			j =fr.nextInt()-1 ;	k =fr.nextInt()-1 ;	tr.get(j).add(k) ;	tr.get(k).add(j) ;
			fct[i] =(i * fct[i-1])%md ;
		}
		dfs (0,-1) ;	sl[0] =dp[0] ;
		for (i =0 ; i<tr.get(0).size() ; ++i)	rer (tr.get(0).get(i) , 0) ;
		for (i =0 ; i<n ; ++i)	op.println(sl[i]) ;
		op.flush();	op.close();
	}
	static void rer (int nd , int p) {
		long nm ,dn ,dm ;	nm =dn =1l ;	dm =sl[p] ;
		dn =((dn*fct[n-1])%md * dp[nd])%md ;	nm =(nm * (fct[n-1-sz[nd]]*fct[sz[nd]])%md)%md ;
		dm =(dm*nm)%md ;	dn =pow (dn,md-2,md) ;	dm =(dm*dn)%md ;

		nm =dn =1l ;	nm =(nm*dm)%md ;	dm =dp[nd] ;
		dn =(dn*fct[sz[nd]-1])%md ;	nm =(nm*fct[n-1])%md ;	dn =(dn*fct[n-sz[nd]])%md ;
		dm =(dm*nm)%md ;	dn =pow (dn,md-2,md) ;	dm =(dm*dn)%md ;	sl[nd] =dm ;

		int j ,k ;
		for (j =0 ; j<tr.get(nd).size() ; ++j) {
			k =tr.get(nd).get(j) ;	if (k==p)	continue;	rer (k,nd) ;
		}
	}
	static void dfs (int nd , int p) {
		int i ,j ;	long nm =1l ,dm =1l ;
		for (i =0 ; i<tr.get(nd).size() ; ++i) {
			j =tr.get(nd).get(i) ;	if (j==p)	continue;
			dfs (j,nd) ;	sz[nd] += sz[j] ;	nm =(nm*dp[j])%md ;	dm =(dm*fct[sz[j]])%md ;
		}
		nm =(nm*fct[sz[nd]-1])%md ;	dm =pow (dm,md-2,md) ;	nm =(nm*dm)%md ;	dp[nd] =nm ;
	}
	static long pow (long b , long e , long md) {
		if (e==0l)	return 1l;
		if (e==1l)	return b;
		long dm =pow(b,e/2l,md) ;	dm *= dm ;	dm %= md ;
		if ((e&1l)==1l)	{	dm *= b ;	dm %= md ;	}
		return dm ;
	}		
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br =new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st==null || (!st.hasMoreElements())) 
			{
				try
				{
					st =new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}

		String nextLine() {
			String str ="";

			try
			{
				str =br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next()) ;
		}
	}
}