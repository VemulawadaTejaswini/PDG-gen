
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

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
    public static long mod = (long) (1e9+7);
    public final static int MAX = (int) 90000000;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 Pair[] p = new Pair[n];
	 for(int i=0;i<n;++i) {
		 p[i] = new Pair(sc.nextInt(),sc.nextInt());
	 }
	 Arrays.sort(p,new Comparator<Pair>() {

		@Override
		public int compare(Pair o1, Pair o2) {
			if(o1.y == o2.y) return o2.x-o1.x;
			else
			return o2.y-o1.y;
		}
		 
	 });
	// for(Pair x : p) out.println(x.x+" "+x.y);
	 long ans = 0;
	 int j=0,days = 0;
	 while(j<n) {
		 if(p[j].x + days <= m) {
			 ++days;
			 ans+=p[j].y;
			// out.println(p[j].y);
		 }
		 ++j;
	 }
	 out.print(ans);
	 out.close();
		
	}
	static class Pair{
		int x;
		int y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
}