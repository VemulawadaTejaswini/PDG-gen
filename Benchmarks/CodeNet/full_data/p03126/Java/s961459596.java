import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			for (int j = 0; j < K; j++) {
				int Ai = sc.nextInt();
				if (map.get(Ai) != null) {
					map.put(Ai, map.get(Ai) + 1);
				} else {
					map.put(Ai, 1);
				}
			}
		}

		int result = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == N ) {
				result++;
			}
		}

		System.out.println(result);
	}
}