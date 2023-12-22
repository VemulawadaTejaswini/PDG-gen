import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		FastScanner in= new FastScanner(System.in);
		
		int n= in.nextInt();
		if(n==0) {
			System.out.println(0);
			return;
		}
		String res="";
		while(n!=0) {
			int thing= n/-2;
			int rem= n%-2;
			if(rem<0) {
				rem= (rem+2)%2;
				if(thing<0) thing--;
				else thing++;
			}
			
//			System.out.println(rem);
			res=  ""+rem+res;
			n= thing;
		}
		
		System.out.println(res);
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
	public static int go(String a) {
		int res=0;
		for (int i = 0; i < a.length(); i++) {
			res+= a.charAt(i)-'0';
		}
		return res;
	}
	public static int len(String a) {
		int res=0;
		for (int i = a.length()-1; i >=0; i--) {
			if(a.charAt(i)-'0'==0) res++;
			else return res;
		}
		return res;
	}
}
