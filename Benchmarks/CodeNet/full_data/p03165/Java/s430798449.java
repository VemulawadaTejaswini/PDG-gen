import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	static int memo[][];
	static int n;
	static int m; 
	static StringBuilder sb;
	static void dp(String s1,String s2) {
	for(int i=1;i<s1.length();i++) {
	 for(int j=1;j<s2.length();j++) {
		 if(s1.charAt(i)==s2.charAt(j)) {
			 memo[i][j]=1+memo[i-1][j-1];
		 }else {
			 memo[i][j]=Math.max(memo[i-1][j], memo[i][j-1]);
		 }
	 }
	}
	}
	static void trace(String s1,String s2) {
		int i=s1.length()-1;int j=s2.length()-1;
		while(i>0&&j>0) {
			if(memo[i][j]==1+memo[i-1][j-1]) {
				sb.append(s1.charAt(i));
				i--;j--;
						}
			else if(memo[i-1][j]>=memo[i][j-1]) 
				i--;
			else j--;
			}
	}
	public static void main(String []args) throws IOException {
 		PrintWriter pw =new PrintWriter(System.out);
 		Scanner sc=new Scanner (System.in);
 		String s1=sc.next();
 		String s2=sc.next();
 		s1=" "+s1;
 		s2=" "+s2;
 		n=s1.length();
 		m=s2.length();
 		
 		sb=new StringBuilder("");
 		if(n<=m) {memo=new int [n][m];
 		dp(s1,s2);
 		trace(s1,s2);}else {memo=new int [m][n];
 			dp(s2,s1);
 			trace(s2,s1);
 		}
 		sb.reverse();
 		pw.println(sb);
 		pw.flush();
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
