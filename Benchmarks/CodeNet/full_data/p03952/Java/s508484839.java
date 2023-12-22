import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		// xが2*n-2だったときどうする？その数字もできない。しかし、n=2の時はできる。
		int num[] = { 0, 1, x, 2 * n - 1 };
		if (x < 2 * n - 2 && x > 1) {
			num[0] = x + 1;

		}
		if (x > 1 && x < 2 * n - 2) {
			System.out.println("Yes");
			for (int i = 1; i < 2 * n; i++) {
				if (num[0] != i && num[1] != i && num[2] != i && num[3] != i) {
					System.out.println(i);
				} else if (i == n - 2) {
					for (int j = 0; j < num.length; j++) {
						System.out.println(num[j]);
					}
				}
			}
		} else {
			if (x == 2 && n == 2) {
				System.out.println("Yes");
				for (int i = 1; i <= 3; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println("No");
			}
		}

		sc.close();
	}
}