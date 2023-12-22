import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int INF = Integer.MAX_VALUE / 2;

	
	int fastOne(char[][] f, int n) {
		int fullCols = 0;
		
		for (int j = 0; j < n; j++) {
			boolean fullCol = true;
			for (int i = 0; i < n; i++) {
				fullCol &= f[i][j] == '#';
			}
			fullCols += fullCol ? 1 : 0;
		}
		
		int[] emptyInRow = new int[n];
		
		for (int i = 0; i < n; i++) {
			boolean fullRow = true;
			for (int j = 0; j < n; j++) {
				fullRow &= f[i][j] == '#';
				if (f[i][j] == '.') {
					emptyInRow[i]++;
				}
			}
			if (fullRow) {
				return n - fullCols; 
			}
		}
		
		int ret = INF;

		for (int row = 0; row < n; row++) {

			for (int row2 = 0; row2 < n; row2++) {
				if (f[row2][row] == '.') {
					continue;
				}

				int here = emptyInRow[row] + n - fullCols;

				ret = Math.min(ret, here);

			}

		}

		return ret;
	}
	
	int fast(char[][] f, int n) {
		int ret = fastOne(f, n);
		
		for (int i = 0; i < n; i++) {
			char[][] newF = new char[n][];
			char[] rem = f[i].clone();
			for (int ii = 0; ii < f.length; ii++) {
				newF[ii] = f[ii].clone();
			}
			
			for (int ii = 0; ii < n; ii++) {
				newF[ii][i] = rem[ii];
			}
			
			ret = Math.min(ret, fastOne(newF, n) + 1);
		}
		
		return ret;

	}
	
	static class State {
		char[][] f;

		@Override
		public int hashCode() {
			int ret = 0;
			for (int i = 0; i < f.length; i++) {
				for (int j = 0; j < f[i].length; j++) {
					ret = ret * 2 + (f[i][j] == '#' ? 1 : 0);
				}
			}
			return ret;
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
			if (!Arrays.deepEquals(f, other.f))
				return false;
			return true;
		}

		public State(char[][] f) {
			this.f = f;
		}
		
		State go(int row, int col) {
			int n = f.length;
			char[][] newF = new char[n][];
			char[] rem = f[row].clone();
			for (int i = 0; i < f.length; i++) {
				newF[i] = f[i].clone();
			}
			
			for (int i = 0; i < n; i++) {
				newF[i][col] = rem[i];
			}
			
			return new State(newF);
		}
		
	}
	
	int slow(char[][] f, int n) {
		HashMap<State, Integer> dist = new HashMap<>();
		ArrayDeque<State> que = new ArrayDeque<>();
		
		char[][] goalF = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(goalF[i], '#');
		}
		State goal = new State(goalF);
		
		State init = new State(f);
		
		dist.put(init, 0);
		que.add(init);
		
		while (!que.isEmpty()) {
			State v = que.poll();
			int curD = dist.get(v);
			
//			System.err.println(Arrays.deepToString(v.f));
//			System.err.println(curD);
			
			if (v.equals(goal)) {
				return curD;
			}
			
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					State u = v.go(row, col);
					if (!dist.containsKey(u)) {
						que.add(u);
						dist.put(u, curD + 1);
					}
				}
			}
			
		}
		
		return INF;
	}

	void submit() throws IOException {
		int n = nextInt();
		char[][] f = new char[n][];
		for (int i = 0; i < n; i++) {
			f[i] = nextToken().toCharArray();
		}

		int ret = fast(f, n);
		if (ret >= INF) {
			ret = -1;
		}
		out.println(ret);
//		out.println(slow(f, n));
	}
	
	static final Random rng = new Random();
	
	void stress() {
		int n = 4;
		for (int tst = 0; tst >= 0; tst++) {
			char[][] f = new char[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					f[i][j] = rng.nextBoolean() ? '.' : '#';
				}
			}
			
			int fast = fast(f, n);
			int slow = slow(f, n);
			if (fast != slow) {
				System.err.println(Arrays.deepToString(f));
				System.err.println(fast);
				System.err.println(slow);
				throw new AssertionError();
			}
			
			System.err.println(tst);
			
		}
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		submit();
//		stress();
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