import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		int[] hotels = new int[n];
		int left = n - 1;
		int right = n - 2;
		while (left >= 0) {
			if (right == 0) {
				hotels[left] = 0;
				left--;
				continue;
			}
			if (arr[left] - arr[right - 1] > l) {
				hotels[left] = right;
				left--;
			} else {
				right--;
			}
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int st = sc.nextInt() - 1;
			int ed = sc.nextInt() - 1;
			int count = 1;
			int x = Math.max(st, ed);
			st = Math.min(st, ed);
			while (hotels[x] > st) {
				x = hotels[x];
				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
