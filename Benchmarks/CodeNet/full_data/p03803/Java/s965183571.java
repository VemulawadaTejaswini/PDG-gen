import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String result = "Draw";

		if (A == 1) {
			A = A * 100;
		} else if (B == 1) {
			B = B * 100;
		}

		if (A > B) {
			result = "Alice";
		} else if (B > A) {
			result = "Bob";
		}
		System.out.println(result);
	}
}
