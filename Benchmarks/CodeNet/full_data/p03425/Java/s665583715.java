import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int N = sc.nextInt();
		String[] names = new String[N];
		int[] initialCounter = new int[5]; // M A R C H
		
		
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
			char initial = names[i].charAt(0);
			switch (initial) {
			case 'M':
				initialCounter[0]++;
				break;
			case 'A':
				initialCounter[1]++;
				break;
			case 'R':
				initialCounter[2]++;
				break;
			case 'C':
				initialCounter[3]++;
				break;
			case 'H':
				initialCounter[4]++;
				break;
			default:
				break;
			}
		}
		
		long ans = 0;
		for (int i = 0; i < initialCounter.length; i++) {
			long add = 0;
			for (int j = i+1; j < initialCounter.length; j++) {
				for (int k = j+1; k < initialCounter.length; k++) {
					add = initialCounter[i]*initialCounter[j]*initialCounter[k];
					ans+= add;
				}
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

