import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] balls = new int[N];
		Map<Integer, Long> sizes = new HashMap<>();
		Set<Integer> contain = new HashSet<>();
		long answerT = 0;
		Map<Integer, Long> temp1 = new HashMap<>();
		Map<Integer, Long> temp2 = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			balls[i] = num;
			contain.add(num);
			try {
				sizes.put(num, sizes.get(num) + 1);
			}
			catch (NullPointerException e) {
				sizes.put(num, 1l);
			}
		}

		for (int k : contain) {
			long size = sizes.get(k);
			temp1.put(k, size * (size - 1) / 2);
			temp2.put(k, (size - 1) * (size - 2) / 2);
			answerT += temp1.get(k);
		}

		for (int i = 0; i < N; i++) {
			int ball = balls[i];
			long answer = 0;

			answer = answerT - temp1.get(ball) + temp2.get(ball);
			System.out.println(answer);
		}
	}
}