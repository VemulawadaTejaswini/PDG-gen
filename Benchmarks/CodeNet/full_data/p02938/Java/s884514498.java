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
		
		long l = fs.nextLong();
		long r = fs.nextLong();
		
		int mod = 1_000_000_007;
		long[][][][] dp = new long[61][2][2][2];
		
		dp[60][0][0][0] = 1;
		for(int i = 59; i >= 0; i--) {
			for(int j = 0; j <2; j++) {
				for(int k = 0; k < 2; k++) {
					for(int s = 0; s < 2; s++) {
						
						long pre = dp[i][j][k][s];
						
						long lb = (l >> i) & 1;
						long rb = (r >> i) & 1;
						
						for(int x = 0; x < 2; x++) {
							for(int y = 0; y < 2; y++) {
								
								int nj = j;
								int nk = k;
								int ns = s;
								
								if(x == 1 && y == 0) {
									continue;
								}
								
								if(s == 0 && x == 0 && y == 1) {
									continue;
								}
								
								if(x == 1 && y == 1) {
									ns = 1;
								}
								
								if(j == 0 && lb == 1 && x == 0) {
									continue;
								}
								
								if(k == 0 && rb == 0 && y == 1) {
									continue;
								}
								
								
								if(lb == 0 && x == 1) {
									nj = 1;
								}
								
								if(rb == 1 && y == 0) {
									nk = 1;
								}
								
								
								dp[i][nj][nk][ns] = (dp[i][nj][nk][ns] + pre) % mod;
							}
						}
					}
				}
			}
			
		}
		
		long ans = 0;
		for(int j = 0; j < 2; j++) {
			for(int k = 0; k < 2; k++) {
				for(int s = 0; s < 2; s++) {
					ans = (ans + dp[0][j][k][s])%mod;
				}
			}
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
