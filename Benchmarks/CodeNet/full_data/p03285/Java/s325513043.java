import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxCake = n / 4;
		boolean answer = false;
		for (int i = 0; i <= maxCake; i++) {
			if ((n - i * 4) % 7 == 0) {
				answer = true;
				break;
			}
		}

		if (answer) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}