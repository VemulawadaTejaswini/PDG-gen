import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);

		int al = 0;
		int bo = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if ((a.length - 1) % 2 == i % 2)
				al += a[i];
			else
				bo += a[i];
		}

		System.out.println(al - bo);

	}
}
