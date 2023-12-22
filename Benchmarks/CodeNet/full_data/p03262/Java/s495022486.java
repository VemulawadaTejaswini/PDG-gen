import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		Set<Integer> xList = new TreeSet<Integer>();
		xList.add(x);
		for (int i = 0; i < n; i++) {
			int xi = scanner.nextInt();
			xList.add(xi);
		}

		Iterator<Integer> xIter = xList.iterator();
		int prev = xIter.next();
		int next = xIter.next();
		int d = next - prev;
		while (xIter.hasNext()) {
			prev = next;
			next = xIter.next();
			d = calc(d, next - prev);
		}
		System.out.println(d);
	}

	private static int calc(int a, int b) {
		if (a==1 || b== 1) {
			return 1;
		}
		if (a == b) {
			return a;
		} if (a < b) {
			return calc(b, a);
		} else {
			if (a % b == 0) {
				return b;
			} else {
				return calc(b, a % b);
			}
		}
	}

}
