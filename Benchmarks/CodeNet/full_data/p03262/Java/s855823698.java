import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Integer> sub = new ArrayList<>();

		list.add(x);

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		for (int i = 0; i < n; i++) {
			sub.add(list.get(i + 1) - list.get(i));
		}

		int e = sub.get(0);

		for(int i = 0; i < n; i++) {
			e = euclidean(e, sub.get(i));
		}


		System.out.println(e);

	}

	static int euclidean(int x, int y) {

		if (y > x) {
			int t = x;
			x = y;
			y = t;
		}

		int tmp;

		while ((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}

		return y;
	}

}
