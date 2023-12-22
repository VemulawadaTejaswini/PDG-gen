import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Integer[] a = new Integer[N];
		for (int i = 0 ; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		int ans = 0;
		Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 0; i < N; i += 2 ) {
			ans += a[i];
			if (i + 1 < N)
				ans -= a[i + 1];
		}
		System.out.println(ans);
	}
}