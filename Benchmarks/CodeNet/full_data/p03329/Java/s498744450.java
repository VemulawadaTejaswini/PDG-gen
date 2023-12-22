import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	int[] nineArr = {9,81,729,6561,59049};
	int[] sixArr = {6,36,216,1296,7776,46656};
	
	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		System.out.println(dfs(n, 0));
	}
	
	int dfs(int value, int depth) {
		
		if(value < 6) {
			return depth + value;
		}
		
		if(value < 9) {
			return depth + 1 + (value - 6);
		}
		
		int sixMax=6, nineMax=9;
		for(int i = nineArr.length - 1; i >= 0; i--) {
			if(nineArr[i] <= value) {
				nineMax = nineArr[i];
				break;
			}
		}
		
		for(int i = sixArr.length - 1; i >= 0; i--) {
			if(sixArr[i] <= value) {
				sixMax = sixArr[i];
				break;
			}
		}
		
		return Math.min(dfs(value - sixMax, depth+1), dfs(value - nineMax, depth+1));
	}

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
