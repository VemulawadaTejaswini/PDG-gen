import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int left = Math.min(a, b) - 1;
		int right = Math.max(c, d) - 1;
		for (int i = left + 1; i < right - 1; i++) {
			if (arr[i] == '#' && arr[i + 1] == '#') {
				System.out.println("No");
				return;
			}
		}
		if (c > d) {
			boolean flag = false;
			for (int i = b - 2; i <= d - 2 && i < n - 2; i++) {
				if (arr[i] == '.' && arr[i + 1] == '.' && arr[i + 2] == '.') {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
