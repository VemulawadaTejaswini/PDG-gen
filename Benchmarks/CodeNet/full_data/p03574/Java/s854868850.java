import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int m = fr.nextInt();
		int n = fr.nextInt();
		Integer[][] sum = new Integer[m][n];
		String[] mine = new String[m];
		for (int i=0; i<m; i++) {
			mine[i] = fr.nextLine();
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (mine[i].charAt(j) == '#') {
					continue;
				}
				sum[i][j] = 0;
				if (i>0 && j>0) {
					sum[i][j] += mine[i-1].charAt(j-1) == '#' ? 1 : 0;
					sum[i][j] += mine[i-1].charAt(j) == '#' ? 1 : 0;
					sum[i][j] += mine[i].charAt(j-1) == '#' ? 1 : 0;
				} else if (i>0) {
					sum[i][j] += mine[i-1].charAt(j) == '#' ? 1 : 0;
				} else if (j>0) {
					sum[i][j] += mine[i].charAt(j-1) == '#' ? 1 : 0;
				}
				if (i < m-1 && j < n-1) {
					sum[i][j] += mine[i+1].charAt(j+1) == '#' ? 1 : 0;
					sum[i][j] += mine[i+1].charAt(j) == '#' ? 1 : 0;
					sum[i][j] += mine[i].charAt(j+1) == '#' ? 1 : 0;
				} else if (i < m-1) {
					sum[i][j] += mine[i+1].charAt(j) == '#' ? 1 : 0;
				} else if (j < n-1) {
					sum[i][j] += mine[i].charAt(j+1) == '#' ? 1 : 0;
				}
				if (i < m-1 && j> 0) {
					sum[i][j] += mine[i+1].charAt(j-1) == '#' ? 1 : 0;
				}
				if (i > 0 && j < n-1) {
					sum[i][j] += mine[i-1].charAt(j+1) == '#' ? 1 : 0;
				}
			}
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (sum[i][j] == null) {
					System.out.print("#");
				} else {
					System.out.print(sum[i][j]);
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
