 
import java.io.*;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;


public class Main {

	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long)(1e9+7);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 int n = sc.nextInt();
		 Pair[] p = new Pair[n];
		 for(int i=0;i<n;++i) p[i] = new Pair(sc.nextInt(),sc.nextInt());
		 Arrays.sort(p,new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.b == o2.b) return o1.a-o2.a;
				else return o1.b-o2.b;
			
			}
			 
		 });
		 
		 long sum = 0;
		 boolean yes = true;
		 for(int i=0;i<n;++i) {
			 sum+=p[i].a;
			 if(sum>p[i].b) {
				 yes = false;
				 break;
			 }
		 }
		 if(yes) out.println("Yes");
		 else out.println("No");
		 
		 
		 out.close();
		 
	}
	
static class Pair{
	int a;
	int b;
	Pair(int a,int b){
		this.a = a;
		this.b = b;
	}
}

}		 



