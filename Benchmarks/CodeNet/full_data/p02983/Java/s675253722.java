import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		int ans = 2019;

		if (L + 2019 < R) {
			R = L + 2019;
		}

		int i;
		int j;
		int mod;
		for (i = L; i <= R-1; i++) {
			for (j = i + 1; j <= R; j++) {
				mod = ((i % 2019) * (j % 2019)) % 2019;
				if (mod < ans) {
					ans = mod;
				}
			}

		}

		System.out.println(ans);

	}

}
