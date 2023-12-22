import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		long ans = 0;
		for (int i = 0; i < (Math.pow(2, S.length() - 1)); i++) {
			int pre = 0;
			long num = 0;
			for (int j = 0; j < S.length() - 1; j++) {
				if ((1&i>>j) == 1) {
					num += Long.parseLong(S.substring(pre, j + 1));
					pre = j + 1;
				}
			}
			num += Long.parseLong(S.substring(pre, S.length()));
			ans += num;
		}
		System.out.println(ans);
	}
}
