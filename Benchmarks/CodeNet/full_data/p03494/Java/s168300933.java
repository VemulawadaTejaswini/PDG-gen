import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int[] numbers = new int[number];
		boolean isEven = true;
		int count = -1;

		for (int i = 0; i < number; i++) {
			numbers[i] = scanner.nextInt();
		}

		do {
			for (int i = 0; i < number; i++) {
				if (numbers[i] % 2 != 0) {
					isEven = false;
					break;
				} else {
					numbers[i] /= 2;
				}
			}
			count++;
		} while (isEven);

		System.out.println(count);

		scanner.close();
	}
}