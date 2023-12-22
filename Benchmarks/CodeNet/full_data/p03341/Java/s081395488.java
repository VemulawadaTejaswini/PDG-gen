import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		String str = fs.next();
		
		int[] leaderImosuArr = new int[n];
		for(int i = 0; i < n; i++) {
			char eOrW = str.charAt(i);
			if(eOrW == 'E') {
				leaderImosuArr[i]++;
			}else {
				leaderImosuArr[0]++;
				if(i < n-1) {
					leaderImosuArr[i+1]--;
				}
			}
		}
		
//		System.out.println(Arrays.toString(leaderImosuArr));
		
		int imosuValue = 0;
		int maxImosuValue = 0;
		for(int i = 0; i < n; i++) {
			imosuValue += leaderImosuArr[i];
			maxImosuValue = Math.max(imosuValue, maxImosuValue);
		}
		
		System.out.println(n - maxImosuValue);
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
