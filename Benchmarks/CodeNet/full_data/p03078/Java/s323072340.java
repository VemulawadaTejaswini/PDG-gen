import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int Y = s.nextInt();
			final int Z = s.nextInt();
			final int K = s.nextInt();
			final long A[] = new long[X];

			for (int x = 0; x < X; x++) {
				A[x] = s.nextLong();
			}

			List<Long> ab = new ArrayList<>(X * Y);
			for (int y = 0; y < Y; y++) {
				long w = s.nextLong();
				for (int x = 0; x < X; x++) {
					ab.add(w + A[x]);
				}
			}
			ab = ab.stream().sorted(Comparator.reverseOrder()).limit(K).collect(Collectors.toList());

			List<Long> abc = new ArrayList<>(ab.size() * Z);
			for (int z = 0; z < Z; z++) {
				long w = s.nextLong();
				for (int i = 0; i < ab.size(); i++) {
					abc.add(w + ab.get(i));
				}
			}
			abc.stream().sorted(Comparator.reverseOrder()).limit(K).forEach(System.out::println);
		}
	}
}
