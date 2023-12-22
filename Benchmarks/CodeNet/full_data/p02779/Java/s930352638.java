import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		boolean t = true;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.print("NO");
				t = false;
				break;
			}
		}

		if (t) {
			System.out.print("YES");
		}

	}
}