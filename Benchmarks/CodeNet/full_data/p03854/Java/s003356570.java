import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	String dream = "dream";
	String dreamer = "dreamer";
	String erase = "erase";
	String eraser = "eraser";

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		String s = fs.next();
		
		int index = 0;
		boolean yes = true;
		
		while(index < s.length()) {
			int retIndex;
			if(s.charAt(index) == 'e') {
				retIndex = checkStrOrStrer(s, index, erase);
				if(retIndex == -1) {
					yes = false;
					break;
				}
				index = retIndex;
			}else if(s.charAt(index) == 'd') {
				retIndex = checkStrOrStrer(s, index, dream);
				if(retIndex == -1) {
					yes = false;
					break;
				}
				index = retIndex;
			}else {
				yes = false;
				break;
			}
				
			
		}
		
		if(yes) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	
	int checkStrOrStrer(String s, int index, String checkString) {
		
		int beforeIndex = 0;
		for(; beforeIndex < checkString.length() && beforeIndex + index < s.length(); beforeIndex++) {
			if(s.charAt(index + beforeIndex) != checkString.charAt(beforeIndex)) {
				return -1;
			}
		}
		
		if(beforeIndex < checkString.length()) {
			return -1;
		}
		
		int afterIndex = 0;
		for(; afterIndex < 3 && index + checkString.length() + afterIndex < s.length(); afterIndex++) {
			if(s.charAt(index + checkString.length() + afterIndex) != eraser.charAt(afterIndex)) {
				break;
			}
		}
		
		if(afterIndex == 2) {
			return index + checkString.length()+2;
		}else {
			return index +checkString.length() ;
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
