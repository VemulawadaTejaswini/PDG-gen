import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int a[] = new int[n];
		int ind1 = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] == 1)
				ind1 = i;
		}

		int cnt = 0;
		int range = ind1;
		while (range < n - 1) {
			range += k - 1;
			cnt++;
		}
		range = ind1;
		while (range > 0) {
			range -= k - 1;
			cnt++;
		}

		System.out.println(cnt);
	}
}
