import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		for (int i = 0; i < t; i++) {
			if (a[i] == 0)
				continue;
			if (a[i] > 0) {
				for (int j = i + 1; j < t; j++) {
					a[j] -= a[i];
				}
			}
		}

		System.out.println(k - 1);
	}

}
