import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		String s = fs.next();
		String t = fs.next();
		fs.close();
		
		HashMap<Character, ArrayList<Integer>> tAndSCharMap = new HashMap<>();
		for(int i = 0; i < t.length(); i++) {
//			Character c = new Character(t.charAt(i));
			char c = t.charAt(i);
			if(!tAndSCharMap.containsKey(c)) {
				tAndSCharMap.put(c, new ArrayList<>());
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
//			Character c = new Character(s.charAt(i));
			char  c = s.charAt(i);
			if(tAndSCharMap.containsKey(c)) {
				tAndSCharMap.get(c).add(i);
			}
		}
		
		long cumlationOfS = 1;
		int lastIndexInS = -1;
		for(int i = 0; i < t.length(); i++) {
//			Character c = new Character(t.charAt(i));
			char c = t.charAt(i);
			ArrayList<Integer> indexInSList = tAndSCharMap.get(c);
//			System.out.println(indexInSList);
			if(indexInSList.size() == 0) {
				System.out.println(-1);
				return;
			}
			
//			int copyOfLastIndexInS = lastIndexInS;
//			int minVal = indexInSList.stream().filter(val -> val.intValue() > copyOfLastIndexInS).mapToInt(val -> val.intValue()).min().orElse(-1);
			int minVal = bisectSearch(indexInSList, lastIndexInS);
//			System.out.println(maxValList);
			
			
			if(minVal < 0) {
				cumlationOfS++;
				lastIndexInS = indexInSList.get(0);
			}else {
				lastIndexInS = minVal;
			}
//			System.out.println(lastIndexInS);
		}
		
		System.out.println((cumlationOfS-1) * (long)s.length() + (long)lastIndexInS + 1);
	}
	
	
	public int bisectSearch(ArrayList<Integer> arr, int searchVal) {
		int left = 0;
		int right = arr.size();
		
		int minHeigher = 1000000000;
		
		while(left < right) {
			int mid = (left+right)/2;
			if(arr.get(mid) <= searchVal) {
				left = mid+1;
			}else {
				minHeigher = Math.min(arr.get(mid), minHeigher);
				right = mid-1;
			}
		}
		
		if(right+1 >= arr.size()) {
			return -1;
		}else if(right >= 0){
			if(arr.get(right) > searchVal) {
				return arr.get(right);
			}else {
				return arr.get(right+1);
			}
		}else {
			return arr.get(right+1);
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
