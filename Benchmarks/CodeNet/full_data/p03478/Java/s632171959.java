import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		// 整数の入力
		int n = sc.nextInt();
		int limit_a = sc.nextInt();
		int limit_b = sc.nextInt();
		int target = limit_a;

		while (target <= n) {
			if (inRange(limit_a,limit_b,target)) {
				ans = ans + target;
			}
			target++;
		}

		System.out.println(ans);

		sc.close();
	}

	private static boolean inRange(int limit_a, int limit_b, int target) {
		boolean ret = false;

		String s = String.format("%02d", target);
		int n1 = Integer.parseInt(s.substring(0, 1));
		int n2 = Integer.parseInt(s.substring(1, 2));

		if (n1 + n2 >= limit_a && n1 + n2 <= limit_b) {
			ret = true;
		}

		return ret;
	}
}
