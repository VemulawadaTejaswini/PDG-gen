import java.io.*;
import java.util.*;
public class Main {
static long[][] memo;
static int I,J;
static String h,s;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
	   h=sc.nextLine();
	   s=sc.nextLine();
	   I=h.length();
	   J=s.length();
	   memo=new long[3003][3003];
	   for(long []a:memo)
		   Arrays.fill(a,-1);
	   solve(0,0);
	 //  System.out.println(memo[0][0]);
	   trace(0,0);
	}
	static long solve(int i, int j)
	{
		if(i >= I || j >= J)
		{
			return 0;
		}
		if(memo[i][j] != -1)	return memo[i][j];
		long opt1 = solve(i + 1, j);
		long opt2 = solve(i, j + 1);
		long opt3 = s.charAt(j) == h.charAt(i) ? solve(i + 1, j + 1) + 1 : 0;
		return memo[i][j] =(long) Math.max(opt1, Math.max(opt2, opt3));
	}
//	static void trace(int i, int j)
//	{
//		if(i >= I || j >= J)	return;
//	 
//		long opt1 = solve(i + 1, j);
//		long opt2 = solve(i, j + 1);
//		if(s.charAt(i) == h.charAt(i))
//		{
//			System.out.println(s.charAt(j));
//			trace(i + 1, j + 1);
//			return; 
//		}
//		else if(opt2 > opt1)
//			trace(i, j + 1);
//		else
//			trace(i + 1, j);
//	 
//	}
	static void trace(int i,int j) {
		if(i==I || j==J)
			return;
		if(h.charAt(i)==s.charAt(j)) {
			System.out.print(s.charAt(j));
			trace(i+1,j+1);
			return;
		}
		if(solve(i+1,j)>solve(i,j+1))
			trace(i+1,j);
		else
			trace(i,j+1);
	}
//	static long dp(int i,int j) {
//		if(i==I || j==J)
//			return 0;
//		if(memo[i][j]!=-1)
//			return memo[i][j];
//		long v=0;
//		if(h.charAt(i)==s.charAt(j))
//	        	v=1+dp(i+1,j+1);
//		return memo[i][j]=Math.max(v, Math.max(dp(i,j+1),dp(i+1,j)));
//	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}