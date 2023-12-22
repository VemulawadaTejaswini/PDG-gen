import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		String S = sc.get();
		var chars = S.toCharArray();
		var pos = new int[3][N];
		switch (chars[0]) {
			case 'R':
				pos[0][0]++;
				break;
			case 'G':
				pos[1][0]++;
				break;
			case 'B':
				pos[2][0]++;
				break;
		}
		for (int i = 1; i < chars.length; i++) {
			pos[0][i] = pos[0][i - 1];
			pos[1][i] = pos[1][i - 1];
			pos[2][i] = pos[2][i - 1];
			switch (chars[i]) {
				case 'R':
					pos[0][i]++;
					break;
				case 'G':
					pos[1][i]++;
					break;
				case 'B':
					pos[2][i]++;
					break;
			}
		}
		long sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (chars[i] == chars[j]) continue;
				int right;
				int ch;
				if (chars[i] != 'R' && chars[j] != 'R') {
					right = 0;
					ch = 'R';
				} else if (chars[i] != 'G' && chars[j] != 'G') {
					right = 1;
					ch = 'G';
				} else {
					right = 2;
					ch = 'B';
				}
				var target = pos[right];
				var count = target[target.length - 1] - target[j];
				var invalid = j + j - i;
				if (invalid < N && chars[invalid] == ch) count -= 1;
				sum += count;
			}
		}

		System.out.println(sum);
	}
}

class Main {
	public static void main(String... args) {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			private StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}