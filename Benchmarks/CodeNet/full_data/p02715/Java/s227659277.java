import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 
 		long n =fr.nextLong() ,ct[] ,sm ,dm ,md =1000000007l ;	int k =fr.nextInt() ,i ,j ;	ct =new long[k+1] ;	ct[k] =1l ;	sm =k ;
 		for (i =k-1 ; i>0 ; --i) {
 			ct[i] =pow(k/i , n , md) ;	for (j =i+i ; j<=k ; j+=i)	ct[i] =(ct[i] - ct[j] + md)%md ;
 			dm =(ct[i] * (1l * i))%md ;	sm =(sm + dm)%md ;
 		}
		op.println(sm) ;	op.flush();	op.close();
	}
	static long pow (long b , long e , long md) {
		if (e==0l)	return 1l;
		if (e==1l)	return b;
		long dm =pow(b,e/2l,md) ;	dm =(dm * dm)%md ;
		if ((e&1l)==1l)	dm =(b * dm)%md ;
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