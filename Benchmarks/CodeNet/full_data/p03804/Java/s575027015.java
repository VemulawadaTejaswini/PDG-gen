import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String a[] = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < m; i++) {
			String b = sc.next();
			boolean can = false;
			for (int j = 0; j < n; j++) {
				if (a[j].indexOf(b) != -1) can = true;
			}
			if (!can) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");


		sc.close();

	}

}