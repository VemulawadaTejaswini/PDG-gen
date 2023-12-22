import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		int q = Integer.parseInt(br.readLine());

		BIT[] arr = new BIT[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = new BIT(500000);
		}
		for (int i = 0; i < n; i++) {
			arr[s[i] - 'a'].add(i + 1, 1);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			if (sa[0].equals("1")) {
				int idx = Integer.parseInt(sa[1]) - 1;
				int bef = s[idx] - 'a';
				arr[bef].add(idx + 1, -1);

				char ch = sa[2].charAt(0);
				int aft = ch - 'a';
				arr[aft].add(idx + 1, 1);
				s[idx] = ch;
			} else {
				int l = Integer.parseInt(sa[1]) - 1;
				int r = Integer.parseInt(sa[2]);
				int ans = 0;
				for (int j = 0; j < 26; j++) {
					if (arr[j].sum(r) - arr[j].sum(l) > 0) {
						ans++;
					}
				}
				pw.println(ans);
			}
		}
		pw.flush();
		br.close();
	}

	static class BIT {
		int n;
		long[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new long[n + 1];
		}

		void add(int idx, long val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		long sum(int idx) {
			long sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
