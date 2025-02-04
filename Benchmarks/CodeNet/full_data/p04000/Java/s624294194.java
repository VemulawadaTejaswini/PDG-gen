import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	long base = 1_000_000_000L;
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int h = fs.nextInt();
		int w = fs.nextInt();
		int n = fs.nextInt();
		
		
		
		HashMap<Long , Integer> pointMap = new HashMap<>();
		
		for(int i = 0; i < n ; i++) {
			
			int[] nextLine = fs.nextIntArr(2);
			int a = nextLine[0];
			int b = nextLine[1];
			
			if(a + 2 <= h) {
				
				if(b+2 <= w) {
					upDatePointMap(pointMap, a,b);
				}
				
				if(b+1 <= w && b-1 >= 1) {
					upDatePointMap(pointMap, a, b-1);
				}
				if(b - 2 >= 1) {
					upDatePointMap(pointMap, a, b-2);
				}
				
			}
			
			if(a + 1 <= h  && a - 1 >=1) {
				if(b+2 <= w) {
					upDatePointMap(pointMap, a-1,b);
				}
				
				if(b+1 <= w && b-1 >= 1) {
					upDatePointMap(pointMap, a-1, b-1);
				}
				if(b - 2 >= 1) {
					upDatePointMap(pointMap, a-1, b-2);
				}	
			}
			
			if(a - 2 >= 1) {
				if(b+2 <= w) {
					upDatePointMap(pointMap, a-2,b);
				}
				
				if(b+1 <= w && b-1 >= 1) {
					upDatePointMap(pointMap, a-2, b-1);
				}
				if(b - 2 >= 1) {
					upDatePointMap(pointMap, a-2, b-2);
				}
			}
			
		}
		
		long[] numOfPointMap = new long[10];
		long sumOfNotZero = 0;
		pointMap.entrySet();
		
		for(Entry<Long, Integer> pointMapEntry : pointMap.entrySet()) {
			numOfPointMap[pointMapEntry.getValue()]++;
			sumOfNotZero++;
		}
//		for(HashMap<Integer,Integer> rowMap : pointMap.values()) {
//			for(Integer numOfSquare : rowMap.values()) {
//				numOfPointMap[numOfSquare]++;
//				sumOfNotZero++;
//			}
//		}
		
		System.out.println((long)(h-2) * (long)(w-2) - sumOfNotZero);
		for(int i = 1; i < 10; i++) {
			System.out.println(numOfPointMap[i]);
		}
	}
	
	public void upDatePointMap(HashMap<Long , Integer> pointMap, int top, int left) {
		if(pointMap.containsKey(top+left*base)) {
			pointMap.put(top+left*base, pointMap.get(top+left*base)+1);
		}else {
			pointMap.put(top+left*base, 1);
		}
	}

//	class Point{
//		
//		int x;
//		int y;
//		
//		Point(int x, int y){
//			this.x = x;
//			this.y = y;
//		}
//		
//		public boolean equals(Object o) {
//			return ((Point) o).x == this.x && ((Point) o).y == this.y;
//		}
//		
//		public int hashCode() {
//			return 
//		}
//	}
	

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

