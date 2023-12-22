import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		String s = fr.nextLine();
		String v = "keyence";
		int n = s.length();
		boolean match = true;
		boolean pos = true;
		int count = 0;
		int curChar = 0;
		for (int i=0; i<n && curChar < v.length(); i++) {
			if (s.charAt(i) == v.charAt(curChar)) {
				curChar++;
				match = true;
			} else if (match) {
				count++;
				match = false;
			}
			if (count > 1) {
				pos = false;
				break;
			}
		}
		if (pos && curChar == v.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
