import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	protected static final String CORRECT = "AC";
	protected static final String WRONG = "WA";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] missions = new int[M];
		String[] scores = new String[M];
		for (int i = 0; i < M; i++) {
			missions[i] = scanner.nextInt();
			scores[i] = scanner.next();
		}
		Set<Integer> correctAns = new HashSet<>();
		Map<String, Integer> penaltiesAns = new HashMap<>();
		for (int i = 0; i < M; i++) {
			if (CORRECT.equals(scores[i])) {
				correctAns.add(missions[i]);
				if (penaltiesAns.containsKey(missions[i] + "AC")) {
					continue;
				} else {
					penaltiesAns.put(missions[i] + "AC", 0);
				}
			} else if (WRONG.equals(scores[i])) {
				if (penaltiesAns.containsKey(missions[i] + "AC")) {
					continue;
				} else if (penaltiesAns.containsKey(missions[i] + "WA")) {
					penaltiesAns.put(missions[i] + "WA", penaltiesAns.get(missions[i] + "WA") + 1);
				} else {
					penaltiesAns.put(missions[i] + "WA", 1);
				}
			}
		}
		int correctRes = correctAns.size();
		int penaltiesRes = 0;
		for (String key : penaltiesAns.keySet()) {
			penaltiesRes += penaltiesAns.get(key);
		}
		System.out.println(correctRes);
		System.out.println(penaltiesRes);
	}
}