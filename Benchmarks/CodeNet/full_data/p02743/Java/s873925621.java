import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static int mod = (int)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a+b+(2.0*Math.sqrt(a)+Math.sqrt(b))<c)
			System.out.println("Yes");
		else System.out.println("No");
	}
	
	
	public static class pair{
		int a;
		int b;
	}
	
	
	
	static int parent[];
	public static int find(int a){
		if(parent[a]==a)
			return a;
		int rep = find(parent[a]);
		parent[a]=rep;
		return rep;
	}
	public static void join(int a, int b){
		int f1 = find(a);
		int f2 = find(b);
		if(f1==f2)
			return;
		
		if(f1<f2)
			parent[f2] = f1;
		else parent[f1] = f2;
	}
	
	
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
}
