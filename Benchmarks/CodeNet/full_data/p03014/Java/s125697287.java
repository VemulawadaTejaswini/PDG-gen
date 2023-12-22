import java.io.*;
import java.util.*;
import java.util.function.*;

class MutableRange {
	MutableRange(int from, int to) {
		this.from = from;
		this.to = to;
	}

	int from;
	int to;

	int length(){
		return to - from;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		char[][] S = new char[H][W];
		Arrays.setAll(S, $ -> sc.get().toCharArray());

		MutableRange[][] rowCum = new MutableRange[H][W];
		MutableRange[][] columnCum = new MutableRange[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (S[i][j] == '#') {
					continue;
				}
				MutableRange vertical = columnCum[i][j] = Optional.ofNullable(i == 0 ? new MutableRange(0, 0) : columnCum[i - 1][j]).orElse(new MutableRange(i, i));
				MutableRange horizontal = rowCum[i][j] = Optional.ofNullable(j == 0 ? new MutableRange(0, 0) : rowCum[i][j - 1]).orElse(new MutableRange(j, j));
				vertical.to++;
				horizontal.to++;
			}
		}

		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				MutableRange row = rowCum[i][j];
				MutableRange column = columnCum[i][j];
				if (row == null || column == null) continue;
				max = Math.max(max, row.length() + column.length() - 1);
			}
		}

		System.out.println(max);

	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
	}
}