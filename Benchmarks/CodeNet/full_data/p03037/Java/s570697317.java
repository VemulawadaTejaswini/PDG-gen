import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int maxLeft = 0;
		int minRight = n;

		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			maxLeft = Math.max(l, maxLeft);
			minRight = Math.min(r, minRight);
		}

		if (minRight < maxLeft) {
			System.out.println(0);
		} else {
			System.out.println(minRight - maxLeft + 1);
		}
	}
}
