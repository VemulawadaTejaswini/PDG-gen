import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();

		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = stdin.nextInt();
		}

		int[] b = new int[num];
		for (int i = 0; i < num; i++) {
			b[i] = stdin.nextInt();
		}

		int xor = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				int sum = a[i] + b[j];
				xor ^= sum;
			}
		}

		System.out.println(xor);
	}
}
