import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		String s = fr.nextLine();
		int curMin = 0;
		long sum = 0;
		int n = s.length();
		for (int i=0; i<n; i++) {
			if (s.charAt(i) == '<') {
				curMin++;
				sum += curMin;
			} else {
				int count = 0;
				while (i<n && s.charAt(i) == '>') {
					count++;
					i++;
				}
				sum += count*(count-1)/2;
				if (count > curMin) {
					sum += count - curMin;
				}
				curMin = 0;
				i--;
			}
		}
		System.out.println(sum);
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
