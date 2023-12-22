import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		String s = fs.next();
		
		HashSet<Integer> rIndexSet = new HashSet<>();
		HashSet<Integer> gIndexSet = new HashSet<>();
		HashSet<Integer> bIndexSet = new HashSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if(charAt == 'R') {
				rIndexSet.add(i);
			}else if(charAt == 'G'){
				gIndexSet.add(i);
			}else {
				bIndexSet.add(i);
			}
		}
		
		long ans = 0;
		for(Integer rIndex : rIndexSet) {
			for(Integer bIndex : bIndexSet) {
				
				int contain = 0;
				int first;
				int second;
				
				if(rIndex < bIndex) {
					
					first = rIndex;
					second = bIndex;
				}else {
					first = bIndex;
					second = rIndex;
				}
				
				int diff = second - first;
				int left = first - diff;
				
				if(gIndexSet.contains(left)) {
					contain++;
				}
				
				int right = second + diff;
				if(gIndexSet.contains(right)) {
					contain++;
				}
				
				if((second - first) % 2 == 0) {
					int mid = left + (second - first) / 2;
					if(gIndexSet.contains(mid)) {
						contain++;
					}
				}
				
				ans += gIndexSet.size() - contain;
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
