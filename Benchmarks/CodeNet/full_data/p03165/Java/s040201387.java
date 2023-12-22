
import java.io.*;
import java.util.*;

public class Main{

	static PrintWriter out=new PrintWriter(System.out);;
	static int [][]memo;
	static int n1,n2;
	static char []s,t;
	static int dp(int i,int j) {
		if(i==n1 || j==n2)
			return 0;
		if(memo[i][j]!=-1)
			return memo[i][j];
		int ans=Math.max(dp(i+1,j+1)+(s[i]==t[j]?1:0), Math.max(dp(i+1,j), dp(i,j+1)));
		return ans;
		
	}
	static void print(int i,int j) {
		if(i==n1 || j==n2)
			return;
		int ans=dp(i,j);
		if(ans==dp(i+1,j))
			print(i+1,j);
		else if(ans==dp(i,j+1))
			print(i,j+1);
		else {
			if(s[i]==t[j])
				out.print(s[i]);
			print(i+1,j+1);
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		
		s=sc.next().toCharArray();
		t=sc.next().toCharArray();
		n1=s.length;
		n2=t.length;
		memo=new int [n1][n2];
		for(int []a:memo)
			Arrays.fill(a, -1);
		dp(0,0);
		print(0,0);
		out.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
