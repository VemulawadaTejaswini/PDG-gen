import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] c = S.toCharArray();
		sc.close();

		long ans = 0;

		for (int i = 0; i < N - 2; i++) {
			char first = c[i];

			for (int j = i + 1; j < N - 1; j++) {
				if (c[j] == first) {
					continue;
				}
				int diff = j - i;
				char second = c[j];

				for (int k = j + 1; k < N; k++) {
					if (c[k] == first || c[k] == second) {
						continue;
					}
					if (k - j != diff) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}
}
