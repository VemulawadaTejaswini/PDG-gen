import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static final int uncal = -1;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		long n = sc.nextLong();
		HashSet<Long> divisors = new HashSet<Long>();
		for (int i = 2; 1l*i*i <= n; i++) {
			if(n%i == 0) {
				divisors.add(1l*i);
				divisors.add(n/i);
			}else if((n-1)%i == 0) {
				divisors.add(1l*i);
				divisors.add((n-1)/i);				
			}
		}
		int cnt = 0;
		if(n == 2)
			cnt++;
		else
			cnt+=2;
		for(long k:divisors) {
			long tmp = n;
			while(tmp%k == 0) {
				tmp /= k;
			}
			if(tmp%k == 1) {
				cnt++;
			}
		}
		out.println(cnt);
		out.close();
	}
	static class Point extends java.awt.Point implements Comparable<Point>{
		public Point(int x,int y) {
			// TODO Auto-generated constructor stub
			super(x,y);
		}
		public String toString() {
			return x+" "+y;
		}
		@Override
		public int compareTo(Point p) {
			// TODO Auto-generated method stub
			if(x == p.x)
				return y - p.y;
			return x - p.x;
		}
		
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public Scanner(String filename) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(filename));
		}
		public String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}
		public int[] inArr(int n) throws Exception{
			int a [] = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			return a;
		}
	}

}