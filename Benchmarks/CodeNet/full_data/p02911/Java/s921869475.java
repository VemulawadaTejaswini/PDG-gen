import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		int[] players = new int[n];

		Arrays.fill(players, k);

		for (int i = 0; i < q; i++) {
			int ans = Integer.parseInt(sc.next());
			for (int j = 0; j < n; j++) {
				if (j != ans - 1) {
					players[j] -= 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (players[i] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}
}