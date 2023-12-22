import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
			if (idx != -1) {
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
