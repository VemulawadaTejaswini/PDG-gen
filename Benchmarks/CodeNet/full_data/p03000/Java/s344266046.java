import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int X = s.nextInt();
			final int[] L = IntStream.generate(s::nextInt).limit(N).toArray();

			boolean fin = false;
			int d = 0;
			for (int i = 0; i < N; i++) {
				d += L[i];
				if (d > X) {
					System.out.println(i + 1);
					fin = true;
					break;
				}
			}
			if (!fin) {
				System.out.println(N + 1);
			}
		}
	}
}
