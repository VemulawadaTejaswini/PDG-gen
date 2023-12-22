import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		int[] costs = new int[n + 1];
		for (int i = 1; i <= n + 1; i++) {
			costs[i - 1] = Math.abs(arr[i - 1] - arr[i]);
			total += costs[i - 1];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			int x = total - costs[i - 1] - costs[i] + Math.abs(arr[i - 1] - arr[i + 1]);
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}
}
