import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i ++) {
			char[] arr = sc.next().toCharArray();
			Arrays.sort(arr);
			str[i] = String.valueOf(arr);
		}

		Arrays.sort(str);

		int ans = 0;
		int same = 1;
		for (int i = 0; i < n - 1; i++) {
			if (str[i].equals(str[i + 1])) {
				same++;
			} else {
				ans += cmb(same);
				same = 1;
			}

			if (i == n - 2) {
				ans += cmb(same);
			}
		}

		System.out.println(ans);

		sc.close();
	}

	static long cmb(long n) {
		long c = 1;
		for (long i = n; i > 0; i--)
			c *= i;
		return c / 2;
	}

}
