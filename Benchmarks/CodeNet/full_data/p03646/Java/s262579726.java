import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long k = scan.nextLong();

		if (k == 0) {
			System.out.println("4");
			System.out.println("3 3 3 3");
		} else if (k == 1) {
			System.out.println("3");
			System.out.println("1 0 3");
		} else if (k <= 50) {
			System.out.println(k);
			for (int i = 0; i < k - 1; i++) {
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println(k);
		} else {
			long a = k / 50;
			long b = k % 50;
			int i = 50;
			System.out.println("50");
			for (; i > 50 - b; i--) {
				System.out.print(50 + a);
				System.out.print(" ");
			}
			for (; i > 1; i--) {
				System.out.print(i + a -1);
				System.out.print(" ");
			}
			System.out.println(i + a - 1);
		}

	}

}
