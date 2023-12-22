import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		int k = nextInt();
		
		List<Integer>[] byRem = new List[k];
		for (int i = 0; i < k; i++) {
			byRem[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < n; i++) {
			int x = nextInt();
			
			byRem[x % k].add(x);
		}
		
		int[] pairs = new int[k];
		int[] rest = new int[k];
		
		for (int i = 0; i < k; i++) {
			Collections.sort(byRem[i]);
			
			
			for (int j = 0; j < byRem[i].size(); ) {
				int nextJ = j;
				while (nextJ < byRem[i].size() && byRem[i].get(j).intValue() == byRem[i].get(nextJ).intValue()) {
					nextJ++;
				}
				
				int len = nextJ - j;
				
				pairs[i] += len / 2;
				rest[i] += len % 2;
				
				j = nextJ;
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < k; i++) {
			int j = (k - i) % k;
			if (j < i) {
				continue;
			}
			
			
			if (i == j) {
				
//				System.err.println(pairs[i] + " " + rest[i]);
				
				ans += (2 * pairs[i] + rest[i]) / 2;
			} else {
				
				int p1 = pairs[i];
				int r1 = rest[i];
				
				int p2 = pairs[j];
				int r2 = rest[j];
				
				if (2 * p1 + r1 < 2 * p2 + r2) {
					int tmp = r1;
					r1 = r2;
					r2 = tmp;
					
					tmp = p1;
					p1 = p2;
					p2 = tmp;
				}
				
//				System.err.println(p1 + " " + r1 + ", " + p2 + " " + r2);

				ans += 2 * p2 + r2;
				
				int rest1 = 2 * p1 + r1 - 2 * p2 - r2;
				
				ans += Math.min(rest1 / 2, p1);
				
			}
		}
		
		out.println(ans);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}