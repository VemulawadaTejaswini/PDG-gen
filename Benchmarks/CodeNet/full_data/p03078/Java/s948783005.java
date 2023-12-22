import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int Y = s.nextInt();
			final int Z = s.nextInt();
			final int K = s.nextInt();
			final List<Long> A = new ArrayList<>(X);
			final List<Long> B = new ArrayList<>(Y);
			final List<Long> C = new ArrayList<>(Z);

			for (int i = 0; i < X; i++) {
				A.add(s.nextLong());
			}
			Collections.sort(A, Comparator.reverseOrder());

			for (int i = 0; i < Y; i++) {
				B.add(s.nextLong());
			}
			Collections.sort(B, Comparator.reverseOrder());

			for (int i = 0; i < Z; i++) {
				C.add(s.nextLong());
			}
			Collections.sort(C, Comparator.reverseOrder());

			List<Long> ret = new ArrayList<>(106307);
			for (int x = 1; x <= X; x++) {
				for (int y = Math.min(1, 3000 / x); y <= Y; y++) {
					for (int z = Math.min(1, 3000 / x / y); z <= Z; z++) {
						ret.add(A.get(x - 1) + B.get(y - 1) + C.get(z - 1));
					}
				}
			}
			Collections.sort(ret, Comparator.reverseOrder());
			for (int i = 0; i < K; i++) {
				System.out.println(ret.get(i));
			}
		}
	}
}
