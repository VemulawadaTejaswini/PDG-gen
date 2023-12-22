import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> d = new ArrayList<>();
		List<Integer> t = new ArrayList<>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			d.add(temp);
		}

		int m = sc.nextInt();

		boolean ans = true;
		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt();

			if (d.contains(temp)) {
				int idx = d.indexOf(temp);
				d.remove(idx);
			} else {
				ans = false;
			}
		}

		if	(ans) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}

}
