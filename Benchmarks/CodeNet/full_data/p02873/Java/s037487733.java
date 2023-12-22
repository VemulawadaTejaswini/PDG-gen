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
		String s = fs.next();
		int[] valArr = new int[s.length()+1];
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '<') {
				valArr[i+1] = valArr[i] + 1;
			}
		}
		
		for(int i = s.length()-1; i >= 0 ; i--) {
			
			if(s.charAt(i) == '>') {
				valArr[i] = Math.max(valArr[i], valArr[i+1] + 1);
			}
		}
		
//		int minVal = s.length()+1;
//		for(int i = 0; i < s.length()+1; i++) {
//			minVal = Math.min(minVal, valArr[i]);
//		}
//		
//		int diff = 0;
//		if(minVal < 0) {
//			diff = (-1)*minVal;
//		}
		
		long ans = 0;
		for(int i = 0; i < s.length()+1; i++) {
			ans += (valArr[i]);
		}
//		System.out.println(Arrays.toString(valArr));
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
