import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int a[]=new int[n];
		List<String> list = new ArrayList<String>();
		long count=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int j=0;j<n-1;j++) {
			for(int k=n-1;k>j;k--) {
				if(list.indexOf(String.valueOf(j))==-1) {
					
				if(list.indexOf(String.valueOf(k))==-1) {
				if((Math.log(a[j]+a[k])/Math.log(2)%1==0)&&list.indexOf(String.valueOf(j))==-1&&list.indexOf(String.valueOf(k))==-1) {
					
					list.add(String.valueOf(j));
					list.add(String.valueOf(k));
					count ++;
				}}
				}
			}
		}
		System.out.println(count);
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




