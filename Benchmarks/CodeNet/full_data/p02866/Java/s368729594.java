import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean isFail = false;
		for (int i = 1; i <= n; i++) {
			int distance = sc.nextInt();
			if (distance == 0 && i != 1) {
				isFail = true;
			}
			if (!map.containsKey(distance)) {
				map.put(distance, 0);
			}
			map.put(distance, map.get(distance) + 1);
		}

		if (isFail) {
			System.out.println(0);
			return;
		}

		int beforeDist = -1;
		int beforeNode = 1;
		long ans = 1;
		long cons = 998244353;

		for (int dist : map.keySet().stream().sorted().collect(Collectors.toList())) {
			if (dist != beforeDist + 1) {
				System.out.println(0);
				return;
			}
			if (dist == 0) {
				if (map.get(dist) != 1) {
					System.out.println(0);
					return;
				}
				beforeDist = 0;
				continue;
			}
			int nodes = map.get(dist);
			long way = (long) Math.pow(beforeNode, nodes) % 998244353;
			ans = ans * way;
			ans = ans % cons;
			beforeNode = nodes;
			beforeDist++;
		}
		System.out.println(ans);
	}
}
