import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		int x = 0;
		int y = 0;
		boolean result = true;
		for (int i = 0; i < n; i++) {
			int t2 = sc.nextInt() - t;
			int x2 = Math.abs(x - sc.nextInt());
			int y2 = Math.abs(y - sc.nextInt());
			int diff = t2 - x2 - y2;
			if (diff < 0) {
				result = false;
			}
			if (diff % 2 != 0) {
				result = false;
			}
		}
		System.out.println(result ? "Yes" : "No");
	}
}
