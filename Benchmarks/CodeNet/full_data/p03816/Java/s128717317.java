import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);

		int index = 0;

		boolean isRemaining = false;

		while(index <= n) {

			if (isRemaining) {
				a[index + 1] = a[index];
				a[index] = 0;
				isRemaining = false;
				index++;
				continue;
			}

			if(index < n - 1 && a[index + 1] == a[index]) {
				a[index] = 0;
				isRemaining = true;
			}

			index++;

		}

		// System.out.println(Arrays.toString(a));

		int count = 0;
		for (int i = 0; i < n; i++) {
			if(a[i] != 0) {
				count++;
			}
		}

		System.out.println(count);
	}

}
