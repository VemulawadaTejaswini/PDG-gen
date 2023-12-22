import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = new int[n];
		ans[0] = 0;
		ans[1] = Math.abs(arr[0] - arr[1]);
		for (int i = 2; i < n; i++) {
			ans[i] = Math.min(ans[i - 1] + Math.abs(arr[i] - arr[i - 1]), ans[i - 2] + Math.abs(arr[i] - arr[i - 2]));
		}
		System.out.println(ans[n - 1]);
	}
}
