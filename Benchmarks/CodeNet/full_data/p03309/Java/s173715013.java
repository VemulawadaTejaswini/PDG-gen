import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt() - (i + 1);
		}

		Arrays.sort(a);
		int b1 = a[n / 2];
		int b2 = a[(n - 1) / 2];

		int ans1 = 0;
		int ans2 = 0;
		for(int i = 0; i < n; i++) {
			ans1 += Math.abs(a[i] - b1);
			ans2 += Math.abs(a[i] - b2);
		}

		System.out.println(Math.min(ans1, ans2));
    }
}
