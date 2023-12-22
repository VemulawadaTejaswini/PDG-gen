import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			map.put(i, scanner.nextInt());
		}

		int tmp = 1;
		int ans = 0;
		for (int i = 1; i <= n + 1; i++) {
			ans++;
			tmp = map.get(tmp);
			if (tmp == 2) {
				break;
			}
			if (ans == n + 1) {
				ans = -1;
			}
		}

		System.out.println(ans);
	}
}