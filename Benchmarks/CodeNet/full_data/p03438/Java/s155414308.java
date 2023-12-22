import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long aa = 0, bb = 0;
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			if (a[i] < b[i]) {
				aa += b[i] - a[i];
			} else {
				bb += a[i] - b[i];
			}
		}

		if (aa % bb == 0 && (aa % bb) % 2 == 0) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}
		System.out.println(sb);

	}
}