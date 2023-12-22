import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static class State {
		char[][] a;

		public State(char[][] a) {
			this.a = a;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			for (char[] row : a) {
				for (char x : row) {
					result = result * prime + x;
				}
			}
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			State other = (State) obj;
			if (!Arrays.deepEquals(a, other.a))
				return false;
			return true;
		}

	}

	HashSet<State> states = new HashSet<>();

	char[][] deepCopy(char[][] a) {
		char[][] b = new char[a.length][];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i].clone();
		}
		return b;
	}

	void dfs(State s, int r, int c) {

		states.add(s);

		for (int i = 0; i < r; i++) {

			char[][] newA = deepCopy(s.a);
			for (int j1 = 0, j2 = c - 1; j1 < j2; j1++, j2--) {

				char tmp = newA[i][j1];
				newA[i][j1] = newA[i][j2];
				newA[i][j2] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}

		for (int j = 0; j < c; j++) {

			char[][] newA = deepCopy(s.a);
			for (int i1 = 0, i2 = r - 1; i1 < i2; i1++, i2--) {

				char tmp = newA[i1][j];
				newA[i1][j] = newA[i2][j];
				newA[i2][j] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}
	}

	int go(char[][] f, int r, int c) {

		State s = new State(f);

		states.clear();

		dfs(s, r, c);

		return states.size();
	}

	int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if ((b & 1) == 0) {
			int ret = pow(a, b / 2);
			return ret * ret;
		}
		return a * pow(a, b - 1);
	}

	int fastCount(int r, int c) {

		if (r == 1 || c == 1) {
			return (r * c == 1) ? 1 : 2;
		}

		int ret = pow(24, (r / 2) * (c / 2));

		if (r % 2 == 1) {
			ret *= 2;
		}

		if (c % 2 == 1) {
			ret *= 2;
		}

		return ret;
	}

	int solve(char[][] f, int r, int c) {

		// if (r == 1) {
		//
		// out.println(isPalindrome(f[0]) ? 1 : 2);
		// return;
		// }

		int p = 1_000_000_007;

		int justAns = 1;

		boolean has24 = false;
		boolean all24 = true;

		for (int i = 0; i < r / 2; i++) {
			for (int j = 0; j < c / 2; j++) {

				char[] arr = { f[i][j], f[r - 1 - i][j], f[i][c - 1 - j],
						f[r - 1 - i][c - 1 - j] };

				int now = go(arr);

				all24 &= now == 24;
				has24 |= now == 24;

				justAns = (int) ((long) justAns * now % p);
			}
		}

		int ans = justAns;
		if ((r / 2) % 2 == 0 && (c / 2) % 2 == 0 && has24 && all24) {
			ans = (int) ((long) ans * 500_000_008 % p);
		}

		if (r % 2 == 1) {
			ans *= isPalindrome(f[r / 2]) ? 1 : 2;
			ans %= p;
		}

		if (c % 2 == 1) {
			char[] tmp = new char[r];
			for (int i = 0; i < r; i++) {
				tmp[i] = f[i][c / 2];
			}

			ans *= isPalindrome(tmp) ? 1 : 2;
			ans %= p;
		}

		// out.println(ans);

		return ans;
	}

	boolean isPalindrome(char[] c) {
		String s = new String(c);
		String revS = new StringBuilder(s).reverse().toString();

		return s.equals(revS);
	}

	int[] fact = { 1, 1, 2, 6, 24 };

	int go(char[] arr) {
		int[] cnt = new int[26];
		for (char c : arr) {
			cnt[c - 'a']++;
		}

		int ret = fact[arr.length];
		for (int x : cnt) {
			ret /= fact[x];
		}
		return ret;
	}

	int[][] perms = new int[24][];
	int ptr = 0;

	int[] curP = new int[4];
	boolean[] vis = new boolean[4];
	int[] odd = new int[24];

	void genPerms(int pos) {
		if (pos == 4) {

			for (int i = 0; i < 4; i++) {
				for (int j = i + 1; j < 4; j++) {
					if (curP[i] > curP[j]) {
						odd[ptr]++;
					}
				}
			}
			// System.err.println(Arrays.toString(curP) + " " + odd[ptr]);

			perms[ptr++] = curP.clone();

			return;
		}

		for (int i = 0; i < 4; i++) {
			if (!vis[i]) {
				vis[i] = true;
				curP[pos] = i;

				genPerms(pos + 1);

				vis[i] = false;
			}
		}

	}

	Random rng = new Random();

	void stress(int r, int c, int alph) {
		int tst = 0;
		while (tst < 10000) {
			char[][] f = new char[r][c];
			for (int i = 0; i < r; i++)
				for (int j = 0; j < c; j++) {
					f[i][j] = (char) ('a' + rng.nextInt(alph));
				}
			if (solve(f, r, c) != go(f, r, c)) {
				throw new AssertionError(Arrays.deepToString(f));
			}
//			tst++;
			System.err.println(tst++);
		}

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

		genPerms(0);
//
//		for (int r = 1; r <= 6; r++) {
//			for (int c = 1; c <= 6; c++) {
//				System.err.println(r + " " + c);
//				stress(r, c, 6);
//			}
//		}
		
//		stress(5, 5, 4);
//		stress(6, 6, 2);
		
//		 stress(3, 3, 26);

//		go(4, 4);
		int r = nextInt();
		int c = nextInt();
		char[][] f = new char[r][];
		for (int i = 0; i < r; i++) {
			f[i] = nextToken().toCharArray();
		}

		out.println(solve(f, r, c));
//		out.println(go(f, r, c));

		// go(3, 5);
		// go(3, 6);
		// go(4, 5);

		// for (int r = 1; r <= 5; r++) {
		// for (int c = r; c <= 5; c++) {
		// System.err.println(r + " " + c);
		// go(r, c);
		// }
		// }

		// go(5, 6);

		// System.err.println(fastCount(4,5));
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