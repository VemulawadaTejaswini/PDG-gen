import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 4 == 0) {
				cnt++;
			} else if (a % 2 == 0) {
				cnt += 0.5;
			}
		}

		if (n / 2 <= cnt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}