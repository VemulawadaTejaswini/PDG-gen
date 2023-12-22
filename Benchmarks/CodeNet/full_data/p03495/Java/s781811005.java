import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		int K_MAX = 200001;
		int[] array = new int[K_MAX];
		Arrays.fill(array, K_MAX);
		
		int n = sc.nextInt(), k = sc.nextInt();
		int kinds = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (array[a] == K_MAX) {
				array[a] = 1;
				kinds++;
			}else {
				array[a]++;
			}
		}
		int sub = kinds - k;
		int ans = 0;
		if (sub>0) {
			Arrays.sort(array);
			for (int i = 0; i < sub; i++) {
				ans += array[i];
			}
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

