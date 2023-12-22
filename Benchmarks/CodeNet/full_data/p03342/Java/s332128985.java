import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		
		long[] valArr = new long[n];
		for(int i = 0; i < n; i++) {
			valArr[i] = fs.nextLong();
		}
		
		long ans = 0;
		
		int l = 0;
		int r = 0;
		
		long cumSum = 0;
		long cumXor = 0;
		while(l < n && r < n) {
			
			long nextCumSum = cumSum + valArr[r];
			long nextCumXor = cumXor ^ valArr[r];
			
			if(nextCumSum == nextCumXor) {
				cumSum = nextCumSum;
				cumXor = nextCumXor;
				r++;
			}else {
				
				int diff = r - l;
				ans += diff;
				
				cumSum = cumSum - valArr[l];
				cumXor = cumXor ^ valArr[l];
				l++;
			}
		}
		
		
		for(int i = l; i < n; i++) {
			ans += n - i;
		}
		
		System.out.println(ans);
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
