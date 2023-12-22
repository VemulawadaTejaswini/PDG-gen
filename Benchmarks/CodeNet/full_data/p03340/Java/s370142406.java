import java.util.*;

public class Main {

	public static void count(int t, int cnt[]) {
		int tmp = t;
		int i = 0;
		while (tmp > 0) {
			if ((tmp & 1) == 1)
				cnt[i]++;
			tmp >>= 1;
			++i;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		int cnt[][] = new int[n][21];
		for (int i = 0; i < n; ++i)
			count(a[i], cnt[i]);
		long ans = n, sum[] = new long[21];
		boolean flag = true;
		int start = 0;
		for (int i = 0; i < n; ++i) {
			flag = true;
			for (int j = 0; j < cnt[i].length; ++j) {
				sum[j] += cnt[i][j];
				if (sum[j] > 1)
					flag = false;
			}
			if (!flag) {
				for (int j = start; j < i; ++j)
					ans += i - j - 1;
				while (!flag) {
					flag = true;
					for (int j = 0; j < cnt[start].length; ++j) {
						sum[j] -= cnt[start][j];
						if (sum[j] > 1)
							flag = false;
					}
					start++;
				}
				for(int j = start; j < i; ++j)
					ans -= i - j - 1;
			}
		}
		for (int i = start; i < n; ++i)
			ans += n - i - 1;
		System.out.println(ans);
	}

}
