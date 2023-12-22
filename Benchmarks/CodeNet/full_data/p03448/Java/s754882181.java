import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num500 = stdin.nextInt();
		int num100 = stdin.nextInt();
		int num50 = stdin.nextInt();
		int value = stdin.nextInt();

		int count = 0;
		for (int i = 0; i <= num500; i++) {
			int sum500 = 500 * i;
			if (sum500 > value) {
				break;
			}

			for (int j = 0; j <= num100; j++) {
				int sum100 = sum500 + 100 * j;
				if (sum100 > value) {
					break;
				}

				int value50 = value - sum100;
				if (((value50 % 50) == 0) && ((value50 / 50) <= num50)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
