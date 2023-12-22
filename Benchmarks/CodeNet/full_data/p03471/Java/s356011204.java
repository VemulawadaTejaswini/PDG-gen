import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int y = sc.nextInt();

		int yukichi;
		int ichiyo;
		int hideyo;

		int result;

		String ans = "";

		for (yukichi = 0; yukichi <= n; yukichi++) {
			for (ichiyo = 0; ichiyo <= n - yukichi; ichiyo++) {

				hideyo = n - yukichi - ichiyo;
				result = 10000 * yukichi + 5000 * ichiyo + 1000 * hideyo;

				if (yukichi + ichiyo + hideyo == n && result == y) {

					ans = yukichi + " " + ichiyo + " " + hideyo;
				}
			}
		}

		if (ans.equals("")) {
			System.out.println("-1 -1 -1");
		} else {
			System.out.println(ans);
		}

		sc.close();

	}
}