import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		char[][] map = new char[2*n][2*n];
		char[][] S = new char[n][n];
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<n; j++) {
				S[i][j] = s.charAt(j);
			}
		}
		if(n==1) {
			System.out.println(1);
			return;
		}
		{
			for(int l=0; l<2*n; l+=n) {
				for(int k=0; k<2*n; k+=n) {
					for(int i=0; i<n; i++) {
						for(int j=0; j<n; j++) {
							map[l+i][k+j] = S[i][j];
						}
					}		
				}	
			}
		}
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(isSym(i, 0, n, map)) {
				ans += (n-i);
			}
		}
		for(int i=1; i<n; i++) {
			if(isSym(0, i, n, map)) {
				ans += (n-i);
			}
		}
		System.out.println(ans);
	}
	
	static boolean isSym(int i, int j, int n, char[][] map) {
		for(int ii=0; ii<n; ii++) {
			for(int jj=ii; jj<n; jj++) {
				if(map[i+ii][j+jj]!=map[i+jj][j+ii]) {
					return false;
				}
			}
		}
		return true;
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
