import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int DIJ[] = {0, 1, 0, -1, 0};

	static void solve() throws Exception {
		int h = scanInt(), w = scanInt();
		boolean grid[][] = new boolean[h][w];
		int curSet[] = new int[2 * h * w], newSet[] = new int[2 * h * w], curSize = 0;
		for (int i = 0; i < h; i++) {
			String l = scanString();
			for (int j = 0; j < w; j++) {
				grid[i][j] = l.charAt(j) == '#';
				if (grid[i][j]) {
					curSet[curSize++] = i;
					curSet[curSize++] = j;
				}
			}
		}
		int ans = 0;
		do {
			int newSize = 0;
			for (int i = 0; i < curSize; i += 2) {
				int y = curSet[i], x = curSet[i + 1];
				for (int d = 0; d < 4; d++) {
					int ny = y + DIJ[d], nx = x + DIJ[d + 1];
					if (ny >= 0 && ny < h && nx >= 0 && nx < w && !grid[ny][nx]) {
						grid[ny][nx] = true;
						newSet[newSize++] = ny;
						newSet[newSize++] = nx;
					}
				}
			}
			curSize = newSize;
			int t[] = curSet;
			curSet = newSet;
			newSet = t;
			++ans;
		} while (curSize > 0);
		out.print(ans - 1);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}