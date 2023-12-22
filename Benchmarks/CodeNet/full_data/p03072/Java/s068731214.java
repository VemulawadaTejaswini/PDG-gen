import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			scanner.nextLine();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			int max = 0;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] >= max) {
					max = a[i];
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
