import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		int resultCount = 0;
		int result = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			if (i % 2 > 0) {
				continue;
			}
			boolean countFlag = true;
			int num = i;
			while (countFlag) {
				if (num % 2 == 0) {
					num = num / 2;
					count++;
				} else {
					countFlag = false;
				}
			}

			if (count > resultCount) {
				result = i;
				resultCount = count;
			}

		}

		System.out.print(result);

	}

}