import java.io.*;
import java.util.*;

public class Main{


	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),q=sc.nextInt();
		char []s=("a"+sc.next()).toCharArray();
		int []ans=new int [n+1];
		for(int i=1;i<=n;i++) {
			if(i!=n && s[i]=='A' && s[i+1]=='C')
				ans[i]++;
			ans[i]+=ans[i-1];
		}
		while(q-->0) {
			int l=sc.nextInt(),r=sc.nextInt();
			out.println(ans[r-1]-ans[l-1]);
		}
	
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
