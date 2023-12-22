import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
		}
		int cost[]=new int[n];
		cost[0]=0;
		cost[1]=Math.abs(h[1]-h[0]);
		if(n>2) {
			for(int j=2;j<n;j++) {
				cost[j]=Math.min(Math.abs(h[j]-h[j-2])+cost[j-2],Math.abs(h[j]-h[j-1])+cost[j-1]);
			}
		}
		
		System.out.println(cost[n-1]);
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



