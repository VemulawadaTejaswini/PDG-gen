import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();

		boolean flag = false;

		for (int n = 1; n <= 25; n++) {
			for (int m = 1; m <= 14; m++) {
				if (n * 4 + m * 7 == N) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
