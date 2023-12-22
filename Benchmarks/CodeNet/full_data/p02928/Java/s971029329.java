import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		int[] arr = new int[n];
		int[] cArr = new int[n];
		int[] tArr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j]) {
					tArr[i]++;
					if (i > j) {
						cArr[i]++;
					}
				}
			}
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += cArr[i] * k;
			if (k > 1) {
				total += tArr[i] * ((k - 1) * k / 2);
			}
			total %= MOD;
		}
		System.out.println(total);
	}
}
