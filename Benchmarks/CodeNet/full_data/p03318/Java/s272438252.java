import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (i <= 9)
				System.out.println((i));
			else
				System.out.println(10 * (i - 9) + 9);
		}


	}
}