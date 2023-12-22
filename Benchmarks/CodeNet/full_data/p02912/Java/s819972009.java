import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			Arrays.sort(a);
			IntStream.range(0, m).forEach(i -> {
				a[n - 1] /= 2;
				Arrays.sort(a, Math.max(0, n - i - 2), n);
			});
			System.out.println(Arrays.stream(a).mapToLong(i -> (long) i).sum());
		}
	}
}
