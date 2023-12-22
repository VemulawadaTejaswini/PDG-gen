import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String S = sc.get();
		int left = Integer.parseInt(S.substring(0, 2), 10);
		int right = Integer.parseInt(S.substring(2), 10);
		if (isYear(left) && isYear(right)) {
			System.out.println("NA");
		} else if (isYear(left)){
			System.out.println("YYMM");
		} else if (isYear(right)) {
			System.out.println("MMYY");
		} else {
			System.out.println("AMBIGUOUS");
		}
	}
	
	boolean isYear(int n) {
		return n > 12 || n <= 0;
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

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