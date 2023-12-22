import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int[] x = new int[N+1];

			for (int i = 1; i <= N; i++) {
				x[i] = dpCore(i, x);
			}
			System.out.println(x[N]);
		};
	}

	static int dpCore(int target, int[] cache) {
		List<Integer> candidates = new ArrayList<>();
		for (int i = 1; i <= target; i*=9) {
			candidates.add(cache[target-i]+1);
		}
		for (int i = 1; i <= target; i*=6) {
			candidates.add(cache[target-i]+1);
		}
		return candidates.stream().mapToInt(i -> i).min().orElse(999999);
	}
}
