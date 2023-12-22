import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] diameters = new int[n];

		for (int i = 0; i < n; i++) {
			diameters[i] = scanner.nextInt();
		}

		diameters = Arrays.stream(diameters).distinct().toArray();

		System.out.println(diameters.length);

		scanner.close();
	}
}