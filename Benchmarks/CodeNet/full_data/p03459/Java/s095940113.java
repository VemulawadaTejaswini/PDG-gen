import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[] t = new int[n];
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			int tt = 0;
			int aa = 0;
			int bb = 0;

			int dt;
			int dd;

			for (int i = 0; i < n; i++) {
				dt = t[i] - tt;
				dd = Math.abs(a[i] - aa) + Math.abs(b[i] - bb);

				if (dd > dt) {
					System.out.println("No");
					return;
				}

				if((dd-dt) % 2 != 0) {
					System.out.println("No");
					return;
				}

				tt = t[i];
				aa = a[i];
				bb = b[i];
			}

			System.out.println("Yes");

		}
	}

}
