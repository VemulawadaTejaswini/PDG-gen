
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int xmax = n / 4;
		int ymax = n / 7;
		// 4x+7y=n

		for (int x = 0; x <= xmax; x++) {
			for (int y = 0; y <=ymax; y++) {
				if (n == 4 * x + 7 * y) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");

	}

}
