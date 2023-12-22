import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int max = 0;
		List<Integer> balls = new ArrayList<>();
		Map<Integer, Integer> size = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			balls.add(num);
			try {
				size.put(num, size.get(num) + 1);
			}
			catch (NullPointerException e) {
				size.put(num, 1);
			}
			if (num > max) max = num;
		}

		for (int i = 0; i < N; i++) {
			int removed = balls.get(i);
			int answer = 0;

			for (int k = 1; k <= max; k++) {
				if (!size.containsKey(k)) continue;
				int sizeI = k == removed ? size.get(k) - 1 : size.get(k);

				answer += sizeI * (sizeI - 1) / 2;
			}

			System.out.println(answer);
		}
	}
}
