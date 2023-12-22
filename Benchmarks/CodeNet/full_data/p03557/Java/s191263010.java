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
		for (int j = 0; j < n; j++) {
			a[j] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			b[j] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			c[j] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int ans = 0;
		for (int i = 0; i < b.length; i++) {
			int bNumber = b[i];
			int aRes = Arrays.binarySearch(a, bNumber);
			int lowerCount = aRes>=0 ? aRes : ~aRes;
			
			// upper caseのみ工夫が必要
			int cRes = Arrays.binarySearch(c, bNumber);
			int upperCount = 0;
			if (cRes>=0) {
				// 該当する数字が存在する
				// +1して求める
				cRes = Arrays.binarySearch(c, bNumber+1);
				upperCount = cRes>=0 ? c.length - cRes : c.length - (~cRes);
			}else{
				// 該当する数値が存在していないので，
				// そのままビット反転
				upperCount = c.length - ~cRes;
			}
			//int upperCount = cRes>=0 ? c.length - cRes : c.length - (~cRes);
			
			ans += lowerCount*upperCount;
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

