import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int r = in.nextInt(), c = in.nextInt();
		int[] cnt = new int[26];
		for (int i = 0; i < r; i++) {
			for (char ch : in.nextToken().toCharArray()){ 
				cnt[ch - 'a']++;
			}
		}
		
		int cnt4 = (r / 2) * (c / 2);
		int cnt2 = (r / 2) * (c % 2) + (c / 2) * (r % 2);
		int cnt1 = (r % 2) * (c % 2);
		
		for (int i = 0; i < 26; i++) {
			while (cnt[i] >= 4 && cnt4 > 0) {
				cnt[i] -= 4;
				cnt4--;
			}
		}
		for (int i = 0; i < 26; i++) {
			while (cnt[i] >= 2 && cnt2 > 0) {
				cnt[i] -= 2;
				cnt2--;
			}
		}
		for (int i = 0; i < 26; i++) {
			while (cnt[i] >= 1 && cnt1 > 0) {
				cnt[i] -= 1;
				cnt1--;
			}
		}
		out.println((cnt1 == 0 && cnt2 == 0 && cnt4 == 0) ? "Yes" : "No");
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
