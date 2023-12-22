import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int b[];
		b = a.clone();
		Arrays.sort(b);

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != b[n - 1]) {
				max = b[n - 1];
			} else {
				max = b[n - 2];
			}
			System.out.println(max);
		}

	}

}
