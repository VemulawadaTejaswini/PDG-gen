import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

		System.out.println(Arrays.stream(scanner.nextLine().split(" "))
								.mapToInt(Integer::parseInt)
								.map(
									i -> {
										int count = 0;
										while (i % 2 == 0) {
											i /= 2;
											count++;
										}
										return count;
									})
								.sum());
	}
}
