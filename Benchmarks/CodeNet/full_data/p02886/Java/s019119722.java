import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] d = new int[n];
			IntStream.range(0, n).forEach(i -> d[i] = scanner.nextInt());
			System.out.println(
					IntStream.range(0, n - 1).map(i -> IntStream.range(i + 1, n).map(j -> d[i] * d[j]).sum()).sum());
		}
	}
}
