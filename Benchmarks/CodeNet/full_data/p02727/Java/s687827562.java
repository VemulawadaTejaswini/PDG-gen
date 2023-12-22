import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 
 		int x =fr.nextInt() ,y =fr.nextInt() ,a =fr.nextInt() ,b =fr.nextInt() ,c =fr.nextInt() ,n =a+b+c ,i ,j ;
 		long d[][] =new long[a+b+c][2] ,sm =0l ;
 		for (i =0 ; i<a ; ++i) {
 			d[i][0] =fr.nextLong() ;	d[i][1] =0 ;
 		}
 		for ( ; i<a+b ; ++i) {
 			d[i][0] =fr.nextLong() ;	d[i][1] =1 ;
 		}
 		for ( ; i<a+b+c ; ++i) {
 			d[i][0] =fr.nextLong() ;	d[i][1] =2 ;
 		}
 		sort (d , 0 , n-1) ;	a =b =c =0 ;	i =n-1 ;	j =x+y ;
 		while (j-->0) {
 			if (d[i][1]==0)	{
 				++a ;
 				if (a<=x)	sm += d[i][0] ;
 			}
 			else if (d[i][1]==1) {
 				++b ;
 				if (b<=y)	sm += d[i][0] ;
 			}
 			else {
 				++c ;	sm += d[i][0] ;
 			}
 			--i ;
 		}
 		if (a>x) {
 			b += c ;
 			for ( ; i>-1 ; --i) {
 				if (d[i][1]==1) {
 					++b ;	sm += d[i][0] ;
 				}
 				if (b==y)	break;
 			}
 		}
 		else if (b>y) {
 			a += c ;
 			for ( ; i>-1 ; --i) {
 				if (d[i][1]==0) {
 					++a ;	sm += d[i][0] ;
 				}
 				if (a==x)	break;
 			}
 		}
		op.println(sm) ;	op.flush();	op.close();
	}
	public static void sort(long[][] arr , int l , int u)
	{
		int m ;
 
		if(l < u){
			m =(l + u)/2 ;
 
			sort(arr , l , m);	sort(arr , m + 1 , u);
 
			merge(arr , l , m , u);
		}
	} 
	public static void merge(long[][]arr , int l , int m , int u)
	{
		long[][] low = new long[m - l + 1][2];
 
		long[][] upr = new long[u - m][2];
 
		int i ,j =0 ,k =0 ;
 
		for(i =l;i<=m;i++){
			low[i - l][0] =arr[i][0];
			low[i - l][1] =arr[i][1];
		}
 
		for(i =m + 1;i<=u;i++){
			upr[i - m - 1][0] =arr[i][0];
			upr[i - m - 1][1] =arr[i][1];
		}
 
		i =l;
 
		while((j < low.length) && (k < upr.length))
		{
			if(low[j][0] < upr[k][0])
			{
				arr[i][0] =low[j][0];
				arr[i++][1] =low[j++][1];
			}
			else
			{
				arr[i][0] =upr[k][0];
				arr[i++][1] =upr[k++][1];
			
			}
		}
 
		while(j < low.length)
		{
			arr[i][0] =low[j][0];
			arr[i++][1] =low[j++][1];
		}
 
		while(k < upr.length)
		{
			arr[i][0] =upr[k][0];
			arr[i++][1] =upr[k++][1];
		}
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