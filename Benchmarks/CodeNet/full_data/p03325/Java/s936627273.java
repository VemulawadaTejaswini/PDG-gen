import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(IntStream.range(0, n).map(i -> {
				int a = scanner.nextInt(), count = 0;
				while (0 == (a & 1)) {
					count++;
					a >>= 1;
				}
				return count;
			}).sum());
		}
	}
}
