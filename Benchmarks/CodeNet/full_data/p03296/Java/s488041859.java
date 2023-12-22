import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int color = 0;
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (color == a) {
				cnt++;
			} else {
				ans += cnt / 2;
				cnt = 1;
			}
			color = a;
			if (i == n - 1)
				ans += cnt / 2;
		}

		System.out.println(ans);

		sc.close();
	}

}
