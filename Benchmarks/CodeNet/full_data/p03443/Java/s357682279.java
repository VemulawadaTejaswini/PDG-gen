import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		char[] s = nextToken().toCharArray();

		int[] ans = solve(s);
		if (ans == null) {
			out.println("No");
		} else {
			int lastNeg = -1;
//			System.err.println(Arrays.toString(ans));
			for (int i = 0; i < 2 * n; i++) {
				if (ans[i] == -1) {
					if (lastNeg == -1) {
						lastNeg = i;
					} else {
						ans[i] = lastNeg;
						ans[lastNeg] = i;
						lastNeg = -1;
					}
				}
			}

			int ptr = 0;

			int[] outp = new int[2 * n];
			Arrays.fill(outp, -1);
			for (int i = 0; i < 2 * n; i++) {
				if (outp[i] == -1) {
					outp[i] = outp[ans[i]] = ++ptr;
				}
			}

			out.println("Yes");
			for (int x : outp) {
				out.print(x + " ");
			}
			out.println();
		}
	}

	int[] solve(char[] s) {
		int n = (s.length + 1) / 2;
		int[] two = new int[2 * n];
		int[] ones = new int[s.length];
		int cOnes = 0;
		int sz = 0;
		for (int i = 0; i < 2 * n; i++) {
			if ((i == 0 ? '1' : s[i - 1]) == (i == 2 * n - 1 ? '1' : s[i])) {
				two[sz++] = i;
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '1') {
				ones[cOnes++] = i;
			}
		}

		ones = Arrays.copyOf(ones, cOnes);

		if (sz % 2 == 1) {
			return null;
		}

		two = Arrays.copyOf(two, sz);

		int[] next = new int[2 * n];

		OneHolder aux = new OneHolder(ones, n);

		outer: while (System.currentTimeMillis() - start < 1800) {
			shuffle(two);
			Arrays.fill(next, -1);
			for (int i = 0; i < two.length; i += 2) {
				int v = two[i];
				int u = two[i + 1];
				next[v] = u;
				next[u] = v;
			}

			aux.reset();
			int pos = 0;
			while (true) {
				if (next[pos] == -1) {
					int goal = aux.pickNextGoal();
					if (next[goal] != -1 || pos == goal) {
						continue outer;
					}
					next[pos] = goal;
					next[goal] = pos;
				}

				pos = next[pos];
				if (pos == 2 * n - 1) {
					if (aux.isDone()) {
						return next;
					} else {
						continue outer;
					}
				}
				aux.mark(pos);
				pos++;
			}
		}

		return null;
	}

	static class OneHolder {
		private int[] ones;
		private int unkSz;
		private int realSz;

		boolean[] dead;
		int n;

		public OneHolder(int[] ones, int n) {
			this.ones = ones.clone();
			this.n = n;
			dead = new boolean[2 * n];
		}

		void reset() {
			unkSz = realSz = ones.length;
			Arrays.fill(dead, false);
		}

		void mark(int x) {
			dead[x] = true;
			realSz--;
		}

		boolean isDone() {
			return realSz == 0;
		}

		int pickNextGoal() {
			if (isDone()) {
				return 2 * n - 1;
			}
			while (unkSz > 0) {
				int idx = rand(0, unkSz - 1);
				int picked = ones[idx];
				ones[idx] = ones[unkSz - 1];
				ones[unkSz - 1] = picked;
				unkSz--;
				if (dead[picked]) {
					continue;
				}
				return picked;
			}
			throw new AssertionError();
		}
	}

	void shuffle(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = rand(0, i);
			int tmp = a[j];
			a[j] = a[i];
			a[i] = tmp;
		}
	}

	void preCalc() {

	}

	void stress() {

	}

	HashSet<String> set = new HashSet<>();

	void check(int[] arr) {
		// System.err.println(Arrays.toString(arr));
		char[] f = new char[arr.length - 1];
		Arrays.fill(f, '0');
		int cur = arr[0];
		while (cur != arr.length - 1) {
			f[cur] = '1';
			cur = arr[cur + 1];
		}
		// System.err.println(f);
		set.add(new String(f));
	}

	void go(int[] arr, int idx) {
		if (idx == arr.length) {
			check(arr);
			return;
		}
		if (arr[idx] == -1) {
			for (int i = idx + 1; i < arr.length; i++) {
				if (arr[i] != -1) {
					continue;
				}
				arr[idx] = i;
				arr[i] = idx;
				go(arr, idx + 1);
				arr[idx] = arr[i] = -1;
			}
		} else {
			go(arr, idx + 1);
		}
	}

	void gen(int n) {
		int[] arr = new int[2 * n];
		Arrays.fill(arr, -1);
		go(arr, 0);
	}

	void test() {
		for (int n = 3; n <= 3; n++) {
			set.clear();
			gen(n);
			// System.err.println(set.size());
			int len = 2 * n - 1;
			for (int i = 0; i < 1 << len; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < len; j++) {
					sb.append(test(i, j) ? '1' : '0');
				}
				String one = "1" + sb.toString();
				String two = sb.toString() + "1";

				int common = 0;
				for (int j = 0; j < one.length(); j++) {
					if (one.charAt(j) == '1' && two.charAt(j) == '1') {
						common++;
					}
				}

				if (common % 2 == 0 != set.contains(sb.toString())) {
					System.err.println("bad " + sb.toString() + " "
							+ set.contains(sb.toString()) + " " + common);
				}

			}
		}
	}

	static boolean test(int mask, int i) {
		return ((mask >> i) & 1) == 1;
	}

	long start = System.currentTimeMillis();

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
