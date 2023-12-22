
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int result;
	static int reader;
	static ArrayList<Boolean> list;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			result = n;

			list = new ArrayList<Boolean>(n);
			for (int i = 0; i < n; i++) {
				list.add(s.charAt(i) == 'E');
			}
			int countA = 0;
			int countB = 0;
			for (boolean b : list) {
				if (b) {
					countA++;
				} else {
					countB++;
				}
			}
			if (result > countA) {
				result = countA;
			}
			if (result > countB) {
				result = countB;
			}

			calc(0, n - 1);


			System.out.println(result);
		}
	}

	private static void calc(int min, int max) {
		int notE = 0;
		int notW = 0;
		int target = (min + max) / 2;
		for (int i = 0; i < target; i++) {
			if (!list.get(i)) {
				notE++;
			}
		}
		for (int i = target + 1; i < list.size(); i++) {
			if (list.get(i)) {
				notW++;
			}
		}
		if (notE + notW < result) {
			result = notE + notW;
			reader = target;
		}

		if (min == target || max == target) {
			return;
		}
		if (notE < notW) {
			calc(min, target);
		} else if (notE < notW) {
			calc(target, max);
		} else {
			if (target < list.size() / 2) {
				calc(target, max);
			} else {
				calc(min, target);
			}
		}
	}
}
