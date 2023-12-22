import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			long an = sc.nextLong();
			if (an % 4 == 0) {
				a++;
			} else if (an % 2 == 0) {
				b++;
			} else {
				c++;
			}
		}

		if (a >= (n / 2)) {
			System.out.println("Yes");
		} else if ((a >= (c - 1)) && (b % 2 == 0) || (a >= (c - 1)) && (b % 2) <= (a - (c - 1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
