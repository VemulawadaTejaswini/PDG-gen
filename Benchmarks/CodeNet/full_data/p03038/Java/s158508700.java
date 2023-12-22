import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	TreeSet<Integer> valSet;
	HashMap<Integer, Integer> emergeNumMap;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		emergeNumMap = new HashMap<>();
		valSet = new TreeSet<>();
		
		for(int i = 0; i < n; i++) {
			int a = fs.nextInt();
			update(a,1);
		}
		
		for(int i = 0; i < m; i++) {
			int b = fs.nextInt();
			int c = fs.nextInt();
			
			update(c,b);
		}
		
		Iterator<Integer> iterator = valSet.descendingIterator();
		int addedNum = 0;
		long ans = 0;
		while(iterator.hasNext()) {
			int val = iterator.next();
			int emergeNum = emergeNumMap.get(val);
			
			if(addedNum + emergeNum < n) {
				ans += ((long)val) * emergeNum;
				addedNum += emergeNum;
			}else {
				int diff = n - addedNum;
				ans += ((long)val) * diff;
				break;
			}
		}
		
		System.out.println(ans);
		
	}
	
	void update(int val, int num) {
		if(!valSet.contains(val)) {
			valSet.add(val);
			emergeNumMap.put(val, num);
		}else {
			int emergeNum = emergeNumMap.get(val);
			emergeNumMap.put(val, emergeNum+num);
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
