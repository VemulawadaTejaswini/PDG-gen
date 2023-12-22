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
		ArrayList<Point> pointArr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = fs.nextInt();
			int y = fs.nextInt();
			int h = fs.nextInt();
			pointArr.add(new Point(x,y,h));
		}
		
		Comparator<Point> pointComparator = Comparator.comparing(Point::getH);
		pointArr.sort(pointComparator);
		
		int hCandidate;
		int i ,j;
		
		for(i = 0; i <= 100; i++) {
			for(j = 0; j <= 100; j++) {
				boolean validPoint = true;
				boolean allZero = true;
				hCandidate = 1000000007;
				for(int k = 0; k < n; k++) {
					
					Point point = pointArr.get(k);
					if(point.h > 0) {
						if(allZero) {
							if(hCandidate < point.h + Math.abs(i - point.x) + Math.abs(j - point.y)) {
								validPoint = false;
								break;
							}else {
								hCandidate = point.h + Math.abs(i - point.x) + Math.abs(j - point.y);
								allZero = false;
							}
						}else {
							if(hCandidate != point.h + Math.abs(i - point.x) + Math.abs(j - point.y)) {
								validPoint = false;
								break;
							}
						}
					}else {
						hCandidate = Math.min(hCandidate, point.h + Math.abs(i - point.x) + Math.abs(j - point.y));
					}
					
				}
				if(validPoint) {
					System.out.println(i+" "+j+" " +hCandidate);
					return;
				}
			}
		}
	}
	
	class Point{
		int x;
		int y;
		int h;
		Point(int x, int y, int h){
			this.x = x;
			this.y = y;
			this.h = h;
		}
		int getH() {
			return h;
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
