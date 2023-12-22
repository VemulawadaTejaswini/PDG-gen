import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a, b, ans = 0;
		a = sc.nextInt();

		for (int i = 1; i < N; i++) {
			b = sc.nextInt();
			if (a == b) {
				ans++;
				a = -1;
			} else {
				a = b;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
