import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int k = scanner.nextInt();
		int abc[] = new int[3];

		abc[0] = a;
		abc[1] = b;
		abc[2] = c;
		Arrays.sort(abc);

		for (int i = 0; i < k; i++) {
			abc[2] *= 2;
		}

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += abc[i];
		}

		System.out.println(sum);

	}
}
