import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		boolean possible = false;

		for (int i = 0; i < 26; i++) {
			sum = 0;
			for (int j = 0; j < 16; j++) {
				if (4 * i + 7 * j == N) possible = true;
			}
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
