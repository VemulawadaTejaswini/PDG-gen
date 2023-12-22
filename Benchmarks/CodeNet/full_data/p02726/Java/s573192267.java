import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() throws IOException{
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int x = fs.nextInt()-1;
		int y = fs.nextInt()-1;
		
		int[] distArr = new int[n];
		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if(i == j){
					continue;
				}
				int dist;
				if(i <= x && y <= j){
					dist = j - i - (y-x)+1;
				}else if(i <= x && x <= j && j <= y){
					dist = Math.min(j-i, x-i+y-j+1);
				}else if(x <= i && i <= y && y <= j){
					dist = Math.min(j-i, i-x+j-y+1);
				}else{
					dist = j - i;
				}
				distArr[dist]++;
			}
		}
		
		for(int i = 1; i < n; i++){
			System.out.println(distArr[i]);
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
			if(st == null || !st.hasMoreElements()) {
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
			for(int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}
		
		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for(int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}
		
		public void close() throws IOException {
			reader.close();
		}
	}
}

