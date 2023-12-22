import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int[] DX = { 1, 0, -1, 0 };
	static final int[] DY = { 0, 1, 0, -1 };

	void solve() throws IOException {
		int h = nextInt();
		int w = nextInt();

		char[][] f = new char[h][];
		for (int i = 0; i < h; i++) {
			f[i] = nextToken().toCharArray();
		}

		int[][] a = new int[h][w];
		int x0 = 0, y0 = 0, x1 = h - 1, y1 = w - 1;
		int dir = 0;
		
		int freeCells = h * w;
		
		while (freeCells >= 3) {
			
//			System.err.println(x0 + " " + y0 + " " + freeCells);
			
			a[x0][y0] = 1;
			a[x1][y1] = 2;
			freeCells -= 2;
			while (true) {
				int nx0 = x0 + DX[dir];
				int ny0 = y0 + DY[dir];
				if (nx0 < 0 || nx0 >= h || ny0 < 0 || ny0 >= w || a[nx0][ny0] != 0) {
					dir = (dir + 1) % 4;
					continue;
				}
				x0 = nx0;
				y0 = ny0;
				
				x1 += DX[dir ^ 2];
				y1 += DY[dir ^ 2];
				break;
			}
		}
		
		a[x0][y0] = 1;
		a[x1][y1] = 2;
		
//		for (int[] row : a) {
//			System.err.println(Arrays.toString(row));
//		}
		
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 1 || f[i][j] == '#') {
					out.print('#');
				} else {
					out.print('.');
				}
			}
			out.println();
		}
		out.println();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 2 || f[i][j] == '#') {
					out.print('#');
				} else {
					out.print('.');
				}
			}
			out.println();
		}
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}