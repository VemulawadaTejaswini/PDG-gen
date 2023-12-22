import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		HashSet<Integer> accepted = new HashSet<>();

		HashMap<Integer, Integer> penalty = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		IntStream.rangeClosed(1, n).forEach(i -> penalty.put(i, 0));

		for (int i = 0; i < m; i++) {
			int problem = sc.nextInt();
			String result = sc.next();
			if (!accepted.contains(problem)) {
				// まだ正解していない
				if (result.equals("AC")) {
					accepted.add(problem);
				} else {
					int prev = penalty.get(problem);
					penalty.put(problem, prev + 1);
				}
			}
		}
		int penaltyNum = 0;
		for (int acceptedProblem : accepted) {
			penaltyNum = penaltyNum + penalty.get(acceptedProblem);
		}
		print(accepted.size() + " " + penaltyNum);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
