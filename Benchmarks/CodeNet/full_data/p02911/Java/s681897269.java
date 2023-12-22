import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(i, 0);
		}
		for (int i = 0; i < Q; i++) {
			int in = sc.nextInt() - 1;
			map.put(in, map.get(in) + 1);
		}
		for (int i = 0; i < N; i++) {
			int score = K;
			score = score - (Q - map.get(i));
			if (score <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
		sc.close();
	}
}
