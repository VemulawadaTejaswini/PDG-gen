import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int N = scanner.nextInt();
		final int M = scanner.nextInt();

		boolean[] flag = new boolean[N];
		boolean judge = true;
		int[] number = new int[N];

		int s, c;
		for (int i = 0; i < M; i++) {
			s = scanner.nextInt();
			c = scanner.nextInt();

			if (N > 1 && s == 1 && c == 0)
				judge = false;

			if (flag[s - 1]) {
				if (number[s - 1] != c)
					judge = false;
			} else {
				flag[s - 1] = true;
				number[s - 1] = c;
			}
		}

		if (judge) {

			if (N == 1) {
				System.out.println(number[0]);
			} else if (N == 2) {
				System.out.print(number[0] > 1 ? number[0] : 1);
				System.out.println(number[1]);
			} else if (N == 3) {
				System.out.print(number[0] > 1 ? number[0] : 1);
				System.out.print(number[1]);
				System.out.println(number[2]);
			}

		} else {
			System.out.println(-1);
		}

	}

}
