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
			int a = sc.nextInt();
			list[i] = a;
			sum += a;
		}

		for (int i = 0; i < n; i++) {
			if (sum <= list[i] * 4) {
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
