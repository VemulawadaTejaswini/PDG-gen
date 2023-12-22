import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int n = sc.nextInt();
		// int num = 0;
		int[] arr = new int[n];
		long check = n * (n + 1) / 2;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
			sum += arr[i];

		}

		if (sum % check != 0) {
			System.out.println("NO");
			return;
		}

		long k = sum / check;
		long s = 0;
		for (int i = 0; i < n; i++) {
			int current = arr[i];
			int next = arr[(i + 1) % n];
			int diff = next - current;
			if ((k - diff) % n != 0) {
				System.out.println("NO");
				return;
			}
			s += (k - diff) / n;
		}

		if (s != k) {

			System.out.println("NO");
			return;
		}

		System.out.println("YES");
	}
}
