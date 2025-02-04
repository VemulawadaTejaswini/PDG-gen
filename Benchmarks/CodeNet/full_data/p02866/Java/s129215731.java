import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long HOGE = 998244353;

		long n = sc.nextLong();


		long[] counter = new long[200000];

		long max = 0;

		for (long i = 0; i < n; i++) {
			int tmp = sc.nextInt();

			if (tmp > max)
				max = tmp;

			counter[tmp]++;
		}

		long before = counter[0];
		long ans = 1;

		for (int i = 0; i < max + 1; i++) {
			if (counter[i] == 0) {
				ans = 0;
			}
			//			System.out.println("b" + before + "c" + counter[i]);
			//			System.out.println(ans);

			ans = (long) Math.pow(before, counter[i]) * ans % HOGE;

			before = counter[i];
		}
		System.out.println(ans);

	}
}
