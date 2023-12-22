import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		double x = sc.nextInt();
		double y = sc.nextInt();
		double ans1 = Math.min(x * h, (w - x) * h);
		double ans2 = Math.min(y * w, (h - y) * w);
		if (ans1 == ans2) {
			System.out.println(ans1 + " " + 1);
		} else {
			System.out.println(Math.max(ans1, ans2) + " " + 0);
		}
	}
}
