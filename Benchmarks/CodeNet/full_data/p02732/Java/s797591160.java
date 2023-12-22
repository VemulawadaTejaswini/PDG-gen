import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			Map<Integer, Integer> map = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				a[i] = scanner.nextInt();
				map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			});
			long sum = map.entrySet().stream().mapToLong(entry -> c(entry.getValue(), 2)).sum();
			Arrays.stream(a).forEach(i -> System.out.println(sum - c(map.get(i), 2) + c(map.get(i) - 1, 2)));
		}
	}

	private static long c(int n, int m) {
		if (m <= n) {
			long answer = 1L;
			for (int i = 1; i <= m; i++) {
				answer *= n + 1 - i;
				answer /= i;
			}
			return answer;
		}
		return 0L;
	}
}
