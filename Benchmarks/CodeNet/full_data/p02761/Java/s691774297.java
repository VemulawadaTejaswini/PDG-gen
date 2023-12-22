import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.lang.Math;


public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int ret = 0;
			int[] valid = new int[n];
			for ( int i = 0; i < valid.length; i++ ) {
				valid[i] = -1;
			}
			
			String[] str = new String[n];
			
			for ( int i = 0; i < m; i ++ ) {
				int s = sc.nextInt();
				int c = sc.nextInt();
				
				if (ret == -1) {
					continue;
				}
				
				if ( valid[s-1] >= 0 && valid[s-1] != c) {
					ret = -1;
					continue;
				} else if ( valid[s-1] >= 0 ) { 
					continue;
				}
				
				ret += (int) (Math.pow(10, n - s) * c);
				valid[s - 1] = c;
				str[s - 1] = String.valueOf(c);
			}
			
			if ("0".equals(str[0])) {
				ret = -1;
			}
			if ( str[0] == null && (n == 3 && "0".equals(str[1]))) {
				ret += (int) (Math.pow(10, n - 1) * 1);
			}
			
			System.out.println(ret);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private class Scanner {
		String[] s;
		int i;
		BufferedReader br;
		String regex = " ";

		public Scanner() {
			s = new String[0];
			i = 0;
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				destruction();
			}
		}

		private void destruction() throws IOException {
			if (br != null)
				br.close();
		}

		public String next() throws IOException {
			if (i < s.length)
				return s[i++];
			String st = br.readLine();
			while (st == "")
				st = br.readLine();
			s = st.split(regex, 0);
			i = 0;
			return s[i++];
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public Long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public Double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
