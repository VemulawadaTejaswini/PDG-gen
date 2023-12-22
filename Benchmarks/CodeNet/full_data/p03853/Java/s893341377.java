import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int h=sc.nextInt();
		int w=sc.nextInt();
		String c[][]=new String[h][w];
		String ans[][]=new String[2*h][w];
		String s[]=new String[h];
		for(int i=0;i<h;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				c[i][j]=String.valueOf((s[i].charAt(j)));
			}
		}
		
		for(int i=0;i<2*h;i++) {
			for(int j=0;j<w;j++) {
				ans[i][j]=c[(int)((i+2)/2)-1][j];
			}
		}
		String ans_s[]=new String[2*h];
		
		for(int i=0;i<2*h;i++) {
			ans_s[i]=String.valueOf(ans[i][0]);
			if(w!=1) {
				for(int j=1;j<w;j++) {
					ans_s[i]+=String.valueOf(ans[i][j]);
				}
			}
		}
		for(int i=0;i<2*h;i++) {
			System.out.println(ans_s[i]);
		}
		
		
	}
	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
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



