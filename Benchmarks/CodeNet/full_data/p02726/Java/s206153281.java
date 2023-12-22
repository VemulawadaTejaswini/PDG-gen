import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

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
 
 		int n =fr.nextInt() ,x =fr.nextInt()-1 ,y =fr.nextInt()-1 ,lvl[] =new int[n] ,i ,j ,k ,l ,d[] =new int[n] ;
 		ArrayList<ArrayList<Integer>> g =new ArrayList<>() ;	Queue<Integer> q =new LinkedList<>() ;
 		for (i =0 ; i<n ; ++i)	g.add(new ArrayList<>()) ;
 		for (i =0 ; i+1<n ; ++i) {
 			g.get(i).add(i+1) ;	g.get(i+1).add(i) ;
 		}
 		g.get(x).add(y) ;	g.get(y).add(x) ;
 		
 		for (l =0 ; l+1<n ; ++l) {	
 			for (i =0 ; i<n ; ++i)	lvl[i] =-1 ;
			lvl[l] =0 ;	q.add(l) ;	
			while (!q.isEmpty()) {
				i =q.poll() ;
				for (j =0 ; j<g.get(i).size() ; ++j) {
					k =g.get(i).get(j) ;	if (lvl[k]!=-1)	continue;
					lvl[k] =lvl[i]+1 ;	q.add(k) ;
				}
			}
			for (i =l+1 ; i<n ; ++i)	d[lvl[i]]++ ;
		}
		for (i =1 ; i<n ; ++i)	op.println(d[i]) ;
		op.flush();	op.close();
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