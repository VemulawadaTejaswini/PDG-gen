import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), q = sc.nextInt();
		int d[] = new int[k];
		for (int i = 0; i < k; ++i) {
			d[i] = sc.nextInt();
		}
		for (int i = 0; i < q; ++i) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int m = sc.nextInt();
			long tmp = 0;
			long a = (long) x;
			for (int j = 0; j < k; ++j) {
				int num = (n - j + k - 2) / k;
				int tmpd = d[j] % m;
				if (tmpd == 0)
					tmp += (long) num;
				a += ((long) tmpd * (long) num);
			}
			long ans = (long) n - 1 - ((a / (long) m) - ((long) x / (long) m)) - tmp;
			System.out.println(ans);
		}
		sc.close();
	}
}
