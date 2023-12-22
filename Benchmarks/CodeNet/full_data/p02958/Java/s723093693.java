import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int p = sc.nextInt();
			if (p != i)
				cnt++;
		}

		System.out.println(cnt <= 2 ? "YES" : "NO");

		sc.close();
	}

}
