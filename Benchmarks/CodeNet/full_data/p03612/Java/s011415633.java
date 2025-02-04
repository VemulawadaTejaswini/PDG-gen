
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] p = new int[n];

			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt() - 1;
			}

			int count = 0;
			while (!check(p)) {
				for (int i = 0; i < p.length; i++) {
					if (i == p[i]) {
						int tmp = p[i];
						p[i] = p[i + 1];
						p[i + 1] = tmp;
						break;
					}
				}
				count++;
			}

			System.out.println(count);
		}
	}

	private static boolean check(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr[i]) {
				return false;
			}
		}

		return true;
	}
}
