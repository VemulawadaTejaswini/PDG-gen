import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr[0] != 0) {
			System.out.println(-1);
			return;
		}
		long count = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				if (arr[i] - arr[i - 1] == 1) {
					count++;
				} else {
					System.out.println(-1);
					return;
				}
			} else {
				count += arr[i];
			}
		}
		System.out.println(count);
	}
}
