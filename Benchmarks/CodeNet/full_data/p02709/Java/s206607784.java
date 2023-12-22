import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		ArrayList<Youzi> youziList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			youziList.add(new Youzi(i+1, fs.nextLong()));
		}
		
		Comparator<Youzi> youziComparator = Comparator.comparing(Youzi::getActivity).reversed();
		youziList.sort(youziComparator);
		
		long dp[][] = new long[n+1][n+1];
		
		for(int i = 0; i < n; i++) {
			
			Youzi nextYouzi = youziList.get(i);
			
			for(int j = 0; j < i+1; j++) {
				int x = i - j;
				int y = j;
				
				dp[x+1][y] = Math.max(dp[x+1][y], dp[x][y] + nextYouzi.activity * (nextYouzi.firstPos - (x+1)));
				dp[x][y+1] = Math.max(dp[x][y+1], dp[x][y] + nextYouzi.activity*(n - y - nextYouzi.firstPos));
			}
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans = Math.max(ans, dp[i][n-i]);
		}
		System.out.println(ans);
	}

	class Youzi{
		int firstPos;
		long activity;
		
		Youzi(int firstPos, long activity){
			this.firstPos = firstPos;
			this.activity = activity;
		}
		
		long getActivity() {
			return activity;
		}
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
