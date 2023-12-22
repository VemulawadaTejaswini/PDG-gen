import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = sc.nextInt();
		}
		for (int j = 0; j < c.length; j++) {
			c[j] = sc.nextInt();	
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int ans = 0;
		for (int i = 0; i < b.length; i++) {
			int bNum = b[i];
			int aCount = 0;
			int cCount = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j]<bNum) {
					aCount++;
				}else {
					break;
				}
			}
			for (int j = c.length-1; j >= 0; j--) {
				if (c[j]>bNum) {
					cCount++;
				}else {
					break;
				}
			}
			ans+= aCount*cCount;
		}
		out.println(ans);
		out.close();
	}

	//-----------http://codeforces.com/blog/entry/7018---------------------------------
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
	//--------------------------------------------------------

}

