import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[3];
		a[0] = n / 100;
		a[1] = (n - n / 100 * 100) / 10;
		a[2] = n % 10;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				a[i] = 9;
			} else {
				a[i] = 1;
			}
		}

		System.out.println(a[0] * 100 + a[1] * 10 + a[2]);

	}
}