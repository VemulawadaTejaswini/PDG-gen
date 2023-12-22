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

		long[] cntSame = new long[n];
		int idx = 0;
		for (int i = 0; i < n - 1; i++) {
			if (str[i].equals(str[i + 1])) {
				cntSame[idx]++;
			} else {
				idx++;
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += cmb(cntSame[i]);
		}

		System.out.println(ans);

		sc.close();
	}

	static long cmb(long n) {
		if (n == 0)
			return 0;

		long c = 1;
		for (long i = n + 1; i > 2; i--)
			c *= i;

		return c;
	}

}
