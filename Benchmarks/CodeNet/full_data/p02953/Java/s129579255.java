import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		int[] b = new int[a];

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		int count = 1;
		boolean flag = true;

		for (int i = 1; i < b.length; i++) {

			if (b[i - 1] <= b[i]) {

				++count;

			} else if ((b[i - 1] -1) <= b[i] && flag) {

				++count;
				flag = false;

			}

		}

		if (b.length == count) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
