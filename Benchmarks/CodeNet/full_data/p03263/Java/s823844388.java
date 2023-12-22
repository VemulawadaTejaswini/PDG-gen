import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	int[][] map;

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		
		int h = fs.nextInt();
		int w = fs.nextInt();
		
		map = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				map[i][j] = fs.nextInt() % 2;
 			}
		}
		
		ArrayList<String> manipList = new ArrayList<>();
		
		int nowH = 0;
		
		while(nowH < h) {
			
			if(nowH % 2 == 0) {
				for(int i = 0; i < w; i++) {
					if(map[nowH][i] % 2 == 1) {
						if(i == w-1) {
							if(nowH != h-1) {
								manipList.add(makeManip(nowH, i, nowH+1, i));
							}
						}else{
							manipList.add(makeManip(nowH, i, nowH, i+1));
						}
					}
				}
			}else {
				for(int i = w - 1; i >= 0; i--) {
					if(map[nowH][i] % 2 == 1) {
						if(i == 0) {
							if(nowH != h-1) {
								manipList.add(makeManip(nowH, i, nowH+1, i));
							}
						}else{
							manipList.add(makeManip(nowH, i, nowH, i-1));
						}
					}
				}
			}
			
			nowH++;
		}
		
		System.out.println(manipList.size());
		for(String str : manipList) {
			System.out.println(str);
		}
	}
	
	String makeManip(int beforeH, int beforeW, int afterH, int afterW){
		
		map[afterH][afterW] += 1;
		
		StringBuffer sb = new StringBuffer();
		sb.append(beforeH+1).append(" ").append(beforeW+1).append(" ").append(afterH+1).append(" ").append(afterW+1);
		return sb.toString();
		
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
