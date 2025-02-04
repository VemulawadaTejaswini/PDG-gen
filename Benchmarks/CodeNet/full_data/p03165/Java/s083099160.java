import java.io.*;
import java.util.*;
public class tr7 {
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
	   memo=new long[I][J];
	   for(long []a:memo)
		   Arrays.fill(a,-1);
	   dp(0,0);
	   long max=0; int im=0; int jm=0;
	   for(int i=0;i<I;i++) {
		   for(int j=0;j<J;j++)
			   if(memo[i][j]>=max) {
				   max=memo[i][j];
				   im=i;
				   jm=j;
			   }
	   }
	   if(max==0) {
		   System.out.println(" ");
		   return;
	   }
	   trace(0,0);
	}
	static void trace(int i,int j) {
		if(i==I || j==J)
			return;
		if(h.charAt(i)==s.charAt(j)) {
			System.out.print(s.charAt(j));
			trace(i+1,j+1);
			return;
		}
		if(dp(i+1,j)>dp(i,j+1))
			trace(i+1,j);
		else
			trace(i,j+1);
	}
	static long dp(int i,int j) {
		if(i==I || j==J)
			return 0;
		if(memo[i][j]!=-1)
			return memo[i][j];
		long v=0;
		if(h.charAt(i)==s.charAt(j))
		v=1+dp(i+1,j+1);
		return memo[i][j]=Math.max(v, Math.max(dp(i,j+1),dp(i+1,j)));
	}
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