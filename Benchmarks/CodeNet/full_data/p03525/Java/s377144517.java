import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 1; i <= n; i += 2) {
			arr[i] = 24 - arr[i];
		}
		Arrays.sort(arr);
		int min = 24;
		for (int i = 1; i < n + 1; i++) {
			int d = arr[i] - arr[i - 1];
			if (min > d) {
				min = d;
			}
		}
		if (min > 24 - arr[n]) {
			min = 24 - arr[n];
		}
		System.out.println(min);
	}
}
