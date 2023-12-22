import java.io.*;
import java.util.*;

public class Main{

	static int []a;
	static long f(int v) {
		long ans=0;
		for(int i=1;i<=a.length;i++) {
			ans+=Math.abs(a[i-1]-(v+i));
		}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		a=new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int lo=-(int)1e9,hi=(int)1e9;
		while(hi-lo>=3) {
			int p1=lo+(hi-lo)/3;
			int p2=hi-(hi-lo)/3;
			long v1=f(p1),v2=f(p2);
			if(v2>v1)
				hi=p2;
			else
				lo=p1;
			
		}
		long ans=(long)(1e18);
		for(int i=lo;i<=hi;i++) {
			ans=Math.min(f(i),ans);
		}
		out.println(ans);
		
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