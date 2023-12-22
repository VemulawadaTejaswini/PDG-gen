import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		
		int ans=0;
		int n=sc.nextInt();
		int h=sc.nextInt();
		int w=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
		}
		for (int j=0;j<n;j++) {
			if(a[j][0]>=h&&a[j][1]>=w) {
				ans++;
			}
		}
		System.out.println(ans);
	}
		
	
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}



