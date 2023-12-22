import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				if (arr[n - i] - arr[n - i - 1] == 1) {
					continue;
				} else if (arr[n - i] > arr[n - i - 1]) {
					System.out.println(-1);
					return;
				}
			}
			count += arr[n - i - 1];
		}
		if (arr[0] != 0) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}
}
