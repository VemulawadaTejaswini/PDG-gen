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
			final long A[] = new long[X];
			final long B[] = new long[Y];
			final long C[] = new long[Z];

			for (int i = 0; i < X; i++) {
				A[i] = s.nextLong();
			}
			for (int i = 0; i < Y; i++) {
				B[i] = s.nextLong();
			}
			for (int i = 0; i < Z; i++) {
				C[i] = s.nextLong();
			}

			List<Long> rank = new ArrayList<>(K);
			for (int x = 0; x < X; x++) {
				for (int y = 0; y < Y; y++) {
					for (int z = 0; z < Z; z++) {
						long w = A[x] + B[y] + C[z];
						if (rank.size() == K && rank.get(K - 1) < w) {
							rank.set(K - 1, w);
							Collections.sort(rank, Comparator.reverseOrder());
						} else if (rank.size() < K) {
							rank.add(w);
						} else if (rank.size() == K - 1) {
							rank.add(w);
							Collections.sort(rank, Comparator.reverseOrder());
						}
					}
				}
			}
			Collections.sort(rank, Comparator.reverseOrder());
			rank.stream().forEach(System.out::println);
		}
	}
}
