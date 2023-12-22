
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int num4 = 0;
			int num2 = 0;
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				if (tmp % 4 == 0) {
					num4++;
					num2++;
				} else if (tmp % 2 == 0) {
					num2++;
				}
			}

			if (n / 2 <= num4) {
				System.out.println("Yes");
				return;
			}

			if (n / 2 < num4 + (num2 / 2)) {
				System.out.println("Yes");
				return;
			}


			System.out.println("No");
		}
	}
}
