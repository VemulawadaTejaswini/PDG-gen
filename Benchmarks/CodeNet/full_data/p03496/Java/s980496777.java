import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (AtCoderReader ar = new AtCoderReader()) {
			ar.nextLine();
			int[] A = ar.nextIntArray();

			List<Point> list = new ArrayList<>();

			int max = Arrays.stream(A).max().getAsInt();
			int min = Arrays.stream(A).min().getAsInt();
			if (min >= 0 || max <= 0) {
				// aが非負整数の場合または、すべて負の整数の場合は何もしない
			} else {
				if (Math.abs(max) >= Math.abs(min)) {
					addAll(A, max, list);
				} else {
					addAll(A, min, list);
				}

				min = Arrays.stream(A).min().getAsInt();
			}

			if (min >= 0) {
				for (int i = 1; i < A.length; i++) {
					while (A[i - 1] > A[i]) {
						A[i] += A[i - 1];
						list.add(new Point(i - 1, i));
					}
				}
			} else {
				for (int i = A.length - 2; i >= 0; i--) {
					while (A[i] > A[i + 1]) {
						A[i] += A[i + 1];
						list.add(new Point(i + 1, i));
					}
				}
			}

			System.out.println(list.size());
			list.stream().map(p -> (p.x + 1) + " " + (p.y + 1)).forEachOrdered(System.out::println);;
		}
	}

	private static void addAll(int[] A, int value, List<Point> list) {
		int valueAt = valueAt(A, value);
		for (int i = 0; i < A.length; i++) {
			if (i != valueAt) {
				A[i] += value;
				list.add(new Point(valueAt, i));
			}
		}
		A[valueAt] += value;
		list.add(new Point(valueAt, valueAt));
	}

	private static int valueAt(int[] A, int value) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == value) {
				return i;
			}
		}
		throw new IllegalArgumentException("value[" + value + "] was not found arrays");
	}

	public static class AtCoderReader implements AutoCloseable {
		private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public final String[] nextStringArray() throws IOException {
			return this.br.readLine().split(" ");
		}

		public final Stream<String> nextStream() throws IOException {
			return Stream.of(this.nextStringArray());
		}

		public final IntStream nextIntStream() throws NumberFormatException, IOException {
			return this.nextStream().mapToInt(Integer::parseInt);
		}

		public final int[] nextIntArray() throws IOException {
			return this.nextIntStream().toArray();
		}

		public final int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(nextLine());
		}

		public final String nextLine() throws IOException {
			return this.br.readLine();
		}

		@Override
		public final void close() throws IOException {
			br.close();
		}
	}
}
