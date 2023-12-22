import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt(); // arrays
		int m = nextInt(); // numbers in each array
		int q = nextInt();
		int[] a = new int[q];
		for (int i = q - 1; i >= 0; i--) {
			a[i] = nextInt() - 1;
		}
		
		TreeSet<Integer>[] sets = new TreeSet[m];
		for (int i = 0; i < m; i++) {
			sets[i] = new TreeSet<>();
		}
		
		for (int i = 0; i < q; i++) {
			sets[a[i]].add(i);
		}
		
		boolean[] used = new boolean[m];
		
		int[] ptrs = new int[n];
		Arrays.fill(ptrs, -1);
		
		int curPos = 0;
		
		int lastProper = -1;
		
		outer: while (true) { // ?
			while (curPos < q && used[a[curPos]]) {
				curPos++;
			}
			
			if (curPos == q) { // huh?
				out.println("Yes");
				return;
			}
			
			int num = a[curPos];
			used[num] = true;
			
			int prev = -1;
			
			for (int i = 0; i < n; i++) {
				Integer newPtr = sets[num].higher(Math.max(prev, ptrs[i]));
				if (newPtr == null) {
					lastProper = num;
					break outer;
				}
				sets[num].remove(newPtr);
				ptrs[i] = newPtr;
				prev = newPtr;
			}
		}
		
		List<Integer> rest = new ArrayList<>();
		rest.add(lastProper);
		for (int i = curPos; i < q; i++) {
			if (!used[a[i]]) {
				rest.add(a[i]);
				used[a[i]] = true;
			}
		}
		
		for (int i = 0; i < rest.size() - 1; i++) {
			if (rest.get(i) > rest.get(i + 1)) {
				out.println("No");
				return;
			}
		}
		
		out.println("Yes");
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