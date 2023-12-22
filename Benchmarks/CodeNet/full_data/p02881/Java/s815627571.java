import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i < 1_000_000; i++) {
			for (int j = 1; j < 10; j++) {
				int result = i * j;
				if (N == result) {
					System.out.println((i - 1) + (j - 1));
					return;
				}
			}
		}

	}
}