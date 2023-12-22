import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - i - 1;
		}

		java.util.Arrays.sort(a);

		int b = a[n / 2];

		// System.out.println(Arrays.toString(a));

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += Math.abs(a[i] - b);
		}
		System.out.println(result);
	}
}