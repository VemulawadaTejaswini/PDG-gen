import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();
		int xy[] = new int[2];

		map.put(x, a);
		map.put(y, b);

		int i = 0;
		for (int k : map.keySet()) {
			xy[i] = k;
			i++;
		}

		int ans = 0;
		ans = Math.min(a * xy[0] + b * xy[0], c * xy[0] * 2);

		if (x != y) {
			int t = xy[1] - xy[0];
			ans += Math.min(map.get(xy[1]) * t, c * t * 2);
		}

		System.out.println(ans);

	}
}
