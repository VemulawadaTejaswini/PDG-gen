import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int l[] = new int[m];
			int r[] = new int[m];
			for (int i = 0; i < m; i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}

			if (m > 1) {
				int result = r[1] - l[m - 1];
				if (result >= 0 && n >= result) {
					System.out.println(result);
				} else if (result >= 0 && result > n) {
					System.out.println(n);
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(r[0] - l[0] + 1);
			}
			
		}
	}
}
