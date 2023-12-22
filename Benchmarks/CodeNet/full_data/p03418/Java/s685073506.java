import java.util.Scanner;

public class Main {

	static boolean[][]  cards;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		long cnt = 0;

		// iが割られる数
		for (int i = 1; i <= n; i++) {
			if(i < k) {
				continue;
			}

			// jが割る数
			for (int j = 1; j <= n; j++) {
				if (i % j >= k) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		sc.close();
	}
}