import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();
		final int x = sc.nextInt();

		List<Integer> mlist = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			mlist.add(sc.nextInt());
		}

		int rcost = 0;
		for (int j = x; j < n; j++) {
			if (mlist.contains(j)) {
				rcost++;
			}
		}

		int lcost = 0;
		for (int k = x; k > 0; k--) {
			if (mlist.contains(k)) {
				lcost++;
			}
		}

		if (rcost > lcost) {
			System.out.println(lcost);
		} else {
			System.out.println(rcost);
		}

	}

}
