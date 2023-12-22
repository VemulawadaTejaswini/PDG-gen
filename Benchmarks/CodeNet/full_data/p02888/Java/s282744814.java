import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(l);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int idx = binarySearch(l, l[i] + l[j] - 0.5);
				ans += idx - 1 - j;
			}
		}
		System.out.println(ans);
	}

	static int binarySearch(int[] array, double val) {
		int ng = -1;
		int ok = array.length;

		while (ok - ng > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] >= val) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
	}
}
