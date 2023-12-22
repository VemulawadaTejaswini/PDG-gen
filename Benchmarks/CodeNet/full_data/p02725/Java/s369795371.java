import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		if (a[n - 1] < k / 2) {
			System.out.println(a[n - 1] - a[0]);
		} else {
			System.out.println(a[n - 2] + k - a[n - 1]);
		}

	}

}