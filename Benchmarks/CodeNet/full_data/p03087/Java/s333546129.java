import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] arr = new int[n + 1];
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
				arr[i + 1]++;
			}
		}
		for (int i = 1; i <= n; i++) {
			arr[i] += arr[i - 1];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			sb.append(arr[r - 1] - arr[l - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
