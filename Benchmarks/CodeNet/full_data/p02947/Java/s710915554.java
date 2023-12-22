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

		long ans = 0;
		long same = 0;
		for (int i = 0; i < n - 1; i++) {
			if (str[i].equals(str[i + 1])) {
				same++;
			} else {
				if (same != 0)
					ans += cmb(same + 1);
				same = 0;
			}
		}

		if (same != 0)
			ans += cmb(same + 1);

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
