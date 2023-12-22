
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int max = 0, min = 200;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			min = Math.min(min, sc.nextInt());
		}

		for (int i = x + 1; i <= y; i++) {
			if (max < i && min >= i) {
				System.out.println("No War");
				return;
			}
		}

		System.out.println("War");

	}

}
