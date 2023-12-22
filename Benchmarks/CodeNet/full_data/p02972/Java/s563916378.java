import java.util.Scanner;

public class Main {
	static int n;
	static int c = 0;
	static int[] a = new int[100000];
	static int[] b = new int[100000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next()) % 2 == 0 ? 0 : 1;
		}

		System.out.println();
		if (preparingBoxes()) {
			if (c > 0) {
				System.out.print(b[0]);
				for (int i = 1; i < n; i++) {
					if (b[i] != 0)
						System.out.print(" " + b[i]);
				}
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("-1");
		}

		sc.close();
	}

	static boolean preparingBoxes() {
		int sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if ((j + 1) % (i + 1) == 0) {
					sum += b[j];
				}
			}
			if (sum % 2 != a[i]) {
				b[i]++;
				c++;
			}
			sum = 0;
		}
		return true;
	}

}
