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
		
		int h = fs.nextInt();
		int w = fs.nextInt();
		
		String[][] matrix = new String[h][];
		
		for(int i = 0; i < h; i++) {
			matrix[i] = fs.next().split("");
		}
		
		
		for(int i = 0 ; i < h; i++) {
			for(int j = 0; j < w; j++) {
				
				String strAt = matrix[i][j];
				if(strAt.equals("#")) {
					boolean canPaint = false;
					
					if(i < h-1 && matrix[i+1][j].equals("#")) {
						canPaint = true;
					}
					
					if(i > 0 && matrix[i-1][j].equals("#")) {
						canPaint = true;
					}
					
					if(j < w-1 && matrix[i][j+1].equals("#")) {
						canPaint = true;
					}
					
					if(j > 0 && matrix[i][j-1].equals("#")) {
						canPaint = true;
					}
					
					if(!canPaint) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		
		System.out.println("Yes");
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
