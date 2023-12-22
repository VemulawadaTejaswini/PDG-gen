import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> d = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			d.add(temp);
		}

		Collections.sort(d);

		int m = sc.nextInt();
		boolean ans = true;
		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt();

			int idx = Collections.binarySearch(d, temp);
			System.out.println(idx);
			if (idx >= 0) {
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
