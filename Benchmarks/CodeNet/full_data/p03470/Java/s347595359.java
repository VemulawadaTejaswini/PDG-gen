import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (AtCoderReader ar = new AtCoderReader()) {

			int N = ar.nextInt();

			Set<Integer> sets = new HashSet<>();
			for (int i = 0; i < N; i++) {
				sets.add(ar.nextInt());
			}

			System.out.println(sets.size());
		}
	}

	public static class AtCoderReader implements AutoCloseable {
		private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public final String[] nextStringArray() throws IOException {
			return this.br.readLine().split(" ");
		}

		public final Stream<String> nextStream() throws IOException {
			return Arrays.stream(this.nextStringArray());
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

		public final int nextInt(int radix) throws NumberFormatException, IOException {
			return Integer.parseInt(nextLine(), radix);
		}

		public final long nextBits() throws NumberFormatException, IOException {
			return Long.parseLong(nextLine().replaceAll(" ", ""), 2);
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
