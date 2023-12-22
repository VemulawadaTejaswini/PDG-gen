import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	

	static class Point implements Comparable<Point> {
		int x,y;
		public Point (int x,int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point o) {
			if (this.x == o.x) {
				return this.y - o.y;
			}
			return this.x - o.x;
		}
	}
	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point red[] = new Point[n];
		Point blue[] = new Point[n];
		for (int i = 0 ; i < n ; ++i) {
			red[i] = new Point(sc.nextInt(),sc.nextInt());
		}
		for (int i = 0 ; i < n ; ++i) {
			blue[i] = new Point(sc.nextInt(),sc.nextInt());
		}
		int ans = 0;
		boolean done[] = new boolean[n];
		Arrays.sort(red);
		Arrays.sort(blue);
		for (int i = n - 1 ; i >= 0 ; --i) {
			
			int ind = -1, ret = 1 << 30;
			for (int j = 0 ; j < n ; ++j) {
				if (done[j]) {
					continue;
				}
				if (red[i].x >= blue[j].x) {
					continue;
				}
				if (blue[j].y > red[i].y) {
					if (ret > blue[j].y) {
						ret = blue[j].y;
						ind = j;
					}
				}
			}
			if (ind != -1) {
				done[ind] = true;
				++ans;
			}
		}
		System.out.println(ans);
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
