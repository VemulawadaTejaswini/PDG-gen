import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String moji;
		moji = sc.next();

		char[] c = moji.toCharArray();
		int x = 0;
		for (int i = 0; i <= n - 1; i++) {
			if (c[i] == 'R') {
				x++;
			}

		}

		if (x >= n / 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}