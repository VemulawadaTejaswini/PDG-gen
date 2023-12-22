import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[n];
		int sum = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			sum += list[i];
		}

		for (int i = 0; i < n; i++) {
			if (sum / (4 * m) <= list[i]) {
				count++;
			}
		}

		if (count >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}
}
