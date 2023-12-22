import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputA = scanner.nextInt();
		int inputB = scanner.nextInt();
		int inputC = scanner.nextInt();
		int inputD = scanner.nextInt();
		scanner.close();

		int result = 0;
		if (inputA < inputB) {
			result += inputA;
		} else {
			result += inputB;
		}
		if (inputC < inputD) {
			result += inputC;
		} else {
			result += inputD;
		}

		System.out.println(result);

	}
}
