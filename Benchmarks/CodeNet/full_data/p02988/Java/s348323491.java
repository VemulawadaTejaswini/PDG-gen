import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		int res = 0;

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 1; i < n - 1; i++) {
			int[] a = { p[i - 1], p[i], p[i + 1] };
			Arrays.sort(a);
			if (a[1] == p[i]) {
				res++;
			}
		}

		System.out.println(res);
	}
}