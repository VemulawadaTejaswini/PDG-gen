import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int h = fr.nextInt();
		int w = fr.nextInt();
		String[] str = new String[h];
		Set<Integer> rows = new HashSet<>();
		Set<Integer> cols = new HashSet<>();
		for (int i=0; i<h; i++) {
			str[i] = fr.nextLine();
			boolean valid = true;
			for (int j=0; j<w; j++) {
				if (str[i].charAt(j) != '.') {
					valid = false;
					break;
				}
			}
			if (valid) {
				rows.add(i);
			}
		}
		for (int j=0; j<w; j++) {
			boolean valid = true;
			for (int i=0; i<h; i++) {
				if (str[i].charAt(j) != '.') {
					valid = false;
					break;
				}
			}
			if (valid) {
				cols.add(j);
			}
		}
		for (int i=0; i<h; i++) {
			if (rows.contains(i)) {
				continue;
			}
			for (int j=0; j<w; j++) {
				if (!cols.contains(j)) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
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
