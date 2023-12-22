import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int a = 0, b = 0, c = 1;

		for (int i = 1; i <= N; i++) {
			int k = i;
			while (k % 2 == 0) {
				k = k / 2;
				a++;
			}
			if (b < a) {
				b = a;
				c = i;
			}
			a = 0;
		}
		System.out.print(c);
		sc.close();
	}
}
