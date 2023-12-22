import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static class Coordinates {
		int x,y;
		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		int m = fr.nextInt();
		Coordinates[] kids = new Coordinates[n];
		Coordinates[] flags = new Coordinates[m];
		for (int i=0; i<n; i++) {
			int x = fr.nextInt();
			int y = fr.nextInt();
			kids[i] = new Coordinates(x, y);
		}
		for (int i=0; i<m; i++) {
			int x = fr.nextInt();
			int y = fr.nextInt();
			flags[i] = new Coordinates(x, y);
		}
		for (int i=0; i<n; i++) {
			Coordinates cur = null;
			int c = -1;
			int minDis = Integer.MAX_VALUE;
			for (int j=0; j<m; j++) {
				if (cur == null || (minDis > Math.abs(flags[j].x - kids[i].x) + Math.abs(flags[j].y - kids[i].y))
						|| ((minDis == Math.abs(flags[j].x - kids[i].x) + Math.abs(flags[j].y - kids[i].y)) 
								&& (flags[j].x < cur.x || flags[j].y < cur.y))) {
					cur = flags[j];
					c = j;
					minDis = Math.abs(flags[j].x - kids[i].x) + Math.abs(flags[j].y - kids[i].y);
				}
			}
			System.out.println(c+1);
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
