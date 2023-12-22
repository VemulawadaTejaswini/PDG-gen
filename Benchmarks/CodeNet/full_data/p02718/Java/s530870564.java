import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int aSum = 0;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			aSum += a[i];
		}

		int required = aSum / (4 * m);
		int pickable = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] >= required) {
				++pickable;
			}

			if (pickable == m) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}

}
