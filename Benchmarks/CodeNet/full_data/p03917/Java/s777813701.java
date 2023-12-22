import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static class State {
		int[][] a;

		public State(int[][] a) {
			this.a = a;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			for (int[] row : a) {
				for (int x : row) {
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

	int[][] deepCopy(int[][] a) {
		int[][] b = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i].clone();
		}
		return b;
	}

	void dfs(State s, int r, int c) {

		states.add(s);

		for (int i = 0; i < r; i++) {

			int[][] newA = deepCopy(s.a);
			for (int j1 = 0, j2 = c - 1; j1 < j2; j1++, j2--) {

				int tmp = newA[i][j1];
				newA[i][j1] = newA[i][j2];
				newA[i][j2] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}

		for (int j = 0; j < c; j++) {

			int[][] newA = deepCopy(s.a);
			for (int i1 = 0, i2 = r - 1; i1 < i2; i1++, i2--) {

				int tmp = newA[i1][j];
				newA[i1][j] = newA[i2][j];
				newA[i2][j] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}

	}

	void go(int r, int c) {
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = i * c + j;
			}
		}

		State s = new State(a);

		states.clear();

		dfs(s, r, c);

		System.err.println(states.size());
		System.err.println(fastCount(r, c));

		for (State endS : states) {
			// System.err.println(Arrays.deepToString(endS.a));
		}
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

	void solve() throws IOException {
		int r = nextInt();
		int c = nextInt();

		char[][] f = new char[r][];

		for (int i = 0; i < r; i++) {
			f[i] = nextToken().toCharArray();
		}

		if (r > c) {

			char[][] newF = new char[c][r];

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					newF[j][i] = f[i][j];
				}
			}

			f = newF;

			int tmp = r;
			r = c;
			c = tmp;

		}

		// if (r == 1) {
		//
		// out.println(isPalindrome(f[0]) ? 1 : 2);
		// return;
		// }

		int p = 1_000_000_007;

		int[] ansArr = { 1, 0 };
		int justAns = 1;

		for (int i = 0; i < r / 2; i++) {
			for (int j = 0; j < c / 2; j++) {

				char[] arr = { f[i][j], f[r - 1 - i][j], f[i][c - 1 - j],
						f[r - 1 - i][c - 1 - j] };

				int[] now = go(arr);
				
				System.err.println(Arrays.toString(now));
				
				int[] nxt = new int[2];
				
				justAns = (int)((long)justAns * now[2] % p);
				
				for (int z1 = 0; z1 < 2; z1++)
					for (int z2 = 0; z2 < 2; z2++) {
						nxt[z1 ^ z2] += (int)((long)ansArr[z1] * now[z2] % p);
						if (nxt[z1 ^ z2] >= p) {
							nxt[z1 ^ z2] -= p;
						}
					}
				
				ansArr = nxt;
			}
			
		}
		
		int ans;
		
		if ((r / 2) % 2 == 0 && (c / 2) % 2 == 0) {
			ans = ansArr[0];
		} else {
			ans = justAns;
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

			ans *= isPalindrome(f[r / 2]) ? 1 : 2;
			ans %= p;
		}

		out.println(ans);

	}

	boolean isPalindrome(char[] c) {
		String s = new String(c);
		String revS = new StringBuilder(s).reverse().toString();

		return s.equals(revS);
	}

	int[] fact = { 1, 1, 2, 6, 24 };

	int[] go(char[] arr) {

		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		HashSet<String> setC = new HashSet<>();

		for (int idx = 0; idx < 24; idx++) {
			int[] perm = perms[idx];

			char[] arr2 = new char[4];
			for (int i = 0; i < 4; i++) {
				arr2[i] = arr[perm[i]];
			}

			((odd[idx] % 2 == 0) ? setA : setB).add(new String(arr2));
			setC.add(new String(arr2));
		}

		return new int[] { setA.size(), setB.size(), setC.size() };
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
//			System.err.println(Arrays.toString(curP) + " " + odd[ptr]);
			
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

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

		genPerms(0);

		// go(4, 4);
		solve();

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