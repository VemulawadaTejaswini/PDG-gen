import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		long []prefix=new long [n],suf=new long [n];
		for(int i=0;i<n;i++) {
			int s=i%2==0?1:-1;
			prefix[i]+=s*a[i];
			if(i>0)
				prefix[i]+=prefix[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			int s=i%2==0?1:-1;
			suf[i]+=s*a[i];
			if(i+1<n)
				suf[i]+=suf[i+1];
		}
		for(int i=0;i<n;i++) {
			long ans=suf[i];
			if(i%2==1)
				ans*=-1;
			
			if(i>0) {
				int len=n-i;
				if(len%2==0)
					ans+=prefix[i-1];
				else
					ans-=prefix[i-1];
			}
			out.println(ans);
		}
		out.close();

	}
	 
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}