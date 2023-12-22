import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = sc.nextInt();

		boolean isOdd = false;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 1) {
				isOdd = true;
			}
		}

		long ans;
		if (isOdd) {
			ans = (long) Math.pow(2, n - 1);
		} else {
			if (p == 0)
				ans = (long) Math.pow(2, n);
			else
				ans = 0;
		}

		System.out.println(ans);
		sc.close();
	}

}
