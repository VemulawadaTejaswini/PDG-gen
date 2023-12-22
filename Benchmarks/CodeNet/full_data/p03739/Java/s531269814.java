import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];

		boolean flag = true;
		int sum = 0, ans = 0;
		int i = 1;

		for (int j = 0; j < a.length; j++) {
			a[j] = in.nextInt();
		}

		if (a[0] != 0) {
			sum += a[0];
			flag = a[0] > 0;
		} else {
			++ans;
			for (; i < a.length; i++) {
				if (a[i] != 0) {
					flag = a[i] > 0;
					if (flag) {
						sum = a[i] - 1;

					} else {
						sum = a[i] + 1;
					}
					break;
				}
				ans += 2;
			}
		}

		for (; i < a.length; i++) {
			if (flag && sum + a[i] >= 0) {
				ans += sum + a[i] + 1;
				sum = -1;
				flag = false;
			} else if (!flag && sum + a[i] <= 0) {
				ans += 1 - (sum + a[i]);
				sum = 1;
				flag = true;
			} else {
				sum += a[i];
				flag = sum > 0;
			}
		}
		System.out.println(ans);
	}

}
