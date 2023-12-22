import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();

		String[] a = new String[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}

		String[] b = new String[m];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.next();
		}

		int row = -1;
		int clm = -1;
		for (int i = 0; i <= n - m; i++) {
			if ((clm = a[i].indexOf(b[0])) != -1) {
				row = i;
				break;
			}
		}

		if (clm == -1) {
			System.out.println("No");
			sc.close();
			return;
		}

		for (int i = row + 1, j = 1; i < row + m; i++, j++) {
			if (a[i].indexOf(b[j]) != 0) {
				System.out.println("No");
				sc.close();
				return;
			}
		}

		System.out.println("Yes");

		sc.close();
	}
}