

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) {
		FastScanner scanner=new FastScanner();
		int n=scanner.nextInt(),k=scanner.nextInt();
		int a[]=scanner.readArray(n);
		
		boolean dp[]=new boolean[k+1];
//		Arrays.fill(dp, true);
//		dp[0]=false;
		
		for(int stones=0;stones<=k;stones++) {
			for(int j:a)
				if(j<=stones&&!dp[stones-j]) dp[stones]=true;
		}
		if(dp[k]) System.out.println("First");
		else System.out.println("Second");
	
		
		

	}
	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDoubel() {
			return Double.parseDouble(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}

