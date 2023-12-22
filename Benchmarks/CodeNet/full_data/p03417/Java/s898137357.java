import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int temp = 1;
				if (0 <= i - 1 && n > i - 1 && 0 <= j - 1 && m > j - 1)
					temp++;

				if (0 <= i - 1 && n > i - 1 && 0 <= j && m > j)
					temp++;

				if (0 <= i - 1 && n > i - 1 && 0 <= j + 1 && m > j + 1)
					temp++;

				if (0 <= i && n > i && 0 <= j - 1 && m > j - 1)
					temp++;

				if (0 <= i && n > i && 0 <= j + 1 && m > j + 1)
					temp++;

				if (0 <= i + 1 && n > i + 1 && 0 <= j - 1 && m > j - 1)
					temp++;

				if (0 <= i + 1 && n > i + 1 && 0 <= j && m > j)
					temp++;

				if (0 <= i + 1 && n > i + 1 && 0 <= j + 1 && m > j + 1)
					temp++;
				cnt = cnt + temp % 2;
			}
		}

		System.out.println(cnt);
	}

}