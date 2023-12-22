import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	int inf = 1_000_000_000;
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		String a = fs.next();
		String b = fs.next();
		String c = fs.next();
		
		int ans = inf;
		ans = Math.min(ans, getMinLen(a,b,c));
		ans = Math.min(ans, getMinLen(a,c,b));
		ans = Math.min(ans, getMinLen(b,a,c));
		ans = Math.min(ans, getMinLen(b,c,a));
		ans = Math.min(ans, getMinLen(c,a,b));
		ans = Math.min(ans, getMinLen(b,a,c));
		
		
		System.out.println(ans);
		
	}
	
	// a 左に来る文字, b 右に来る文字, bStart aの左から何番目か
	String dup(String a, String b, int bStart) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < bStart; i++) {
			sb.append(a.charAt(i));
		}
		for(int i = 0; i < b.length(); i++) {
			if(sb.length() < a.length()) {
				char aAt = a.charAt(sb.length());
				char bAt = b.charAt(i);
				
				if(aAt == bAt) {
					sb.append(aAt);
				}else if(aAt == '?') {
					sb.append(bAt);
				}else if(bAt == '?') {
					sb.append(aAt);
				}else {
					return null;
				}
			}else {
				sb.append(b.charAt(i));
			}
		}
		
		for(int i = sb.length(); i < a.length(); i++) {
			sb.append(a.charAt(i));
		}
		
		return sb.toString();
	}
	
	int getMinLen(String a, String b, String c) {
		int ans = inf;
		int aLen = a.length();
		int bLen = b.length();
		int cLen = c.length();
		
		boolean dupAB[] = getDupArr(a,b);
		boolean dupBC[] = getDupArr(b,c);
		boolean dupAC[] = getDupArr(a,c);
	
		
		for(int aStart = 0; aStart <= aLen; aStart++) {
			for(int bStart = 0; bStart <= bLen; bStart++) {
				if((aStart >= aLen || dupAB[aStart])
						&& (bStart >= bLen || dupBC[bStart])
						&& (aStart + bStart >= aLen || dupAC[aStart+bStart])) {
					int abLen = aLen + Math.max(0, bLen - (aLen - aStart));
					int strLen = abLen + Math.max(0, cLen - (abLen - aStart - bStart));
					ans = Math.min(ans, strLen);
				}
			}
		}
		
		return ans;
	}
	
	boolean[] getDupArr(String a, String b) {
		
		boolean[] retArr = new boolean[a.length()];
		for(int i = 0; i < a.length(); i++) {
			int j = 0;
			boolean ok = true;
			while(j < b.length() && i+j < a.length()) {
				char aAt = a.charAt(i+j);
				char bAt = b.charAt(j);
				
				if(!(aAt == bAt || aAt == '?' || bAt == '?')) {
					ok = false;
					break;
				}
				j++;
			}
			retArr[i] = ok;
		}
		return retArr;
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
