import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] % 2 == 1) {
				System.out.println(0);
				return;
			}
		}

		int cnt = 0;
		out_of_loop: while (true) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					a[i] = a[i] / 2;
				} else {
					break out_of_loop;
				}
			}
			cnt++;
		}

		System.out.println(cnt);
	}
}
