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
		int[] appearanceArr = new int[n+1];
		int[] aArr = new int[n];
		for(int i = 0 ; i < n; i++) {
			int a = fs.nextInt();
			appearanceArr[a]++;
			aArr[i] = a;
		}
		
		long allAppearance = 0;
		
		for(int i = 0; i < n+1;i++) {
			int appearance = appearanceArr[i];
			if(appearance < 2) {
				continue;
			}
			allAppearance += conv2(appearance);
		}
		
		for(int i = 0; i < n; i++) {
			int aVal = aArr[i];
			int appearance = appearanceArr[aVal];
			if(appearance < 2) {
				System.out.println(allAppearance);
				continue;
			}
			System.out.println(allAppearance - conv2(appearance) + conv2(appearance-1));
		}
	}
	
	public long conv2(int n) {
		if(n < 2) {
			return 0;
		}
		long longN = (long)n;
		return longN*(longN-1)/2;
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
