import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] moto = new long[n];
		long[] sort = new long[n];
		long count = 1;
		long goukei = 0;

		for (int i = 0; i < n; i++) {
			moto[i] = count;
			count++;
		}
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				sort[i] = moto[0];
			} else {
				sort[i] = moto[i + 1];
			}
		}
		for (int i = 0; i < n; i++) {
			goukei += moto[i] % sort[i];
		}
		System.out.println(goukei);

	}
}