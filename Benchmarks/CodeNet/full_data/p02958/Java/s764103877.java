import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			p[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i != p[i]) {
				count++;
			}
		}

		if (count == 0 || count == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}