import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int left = 0;
		int right = 0;
		int diffMin = 1000;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				left += a[j];
			}
			for (int j = i; j < n; j++) {
				right += a[j];
			}
			if (Math.abs(left - right) < diffMin) {
				diffMin = Math.abs(left - right);
			}

			left = 0;
			right = 0;
		}

		System.out.println(diffMin);

	}

}
