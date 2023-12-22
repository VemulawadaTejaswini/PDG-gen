import java.util.Scanner;

public class Main {
	protected static final String CORRECT = "AC";
	protected static final String WRONG = "WA";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] missions = new int[N];
		String[] scores = new String[N];
		int correctRes = 0;
		int penaltiesRes = 0;
		for (int i = 0; i < M; i++) {
			int num = scanner.nextInt();
			String score = scanner.next();
			if (score.equals(WRONG) && !CORRECT.equals(scores[num - 1])) {
				missions[num - 1] += 1;
//				penaltiesRes++;
			} else if (score.equals(CORRECT) && !CORRECT.equals(scores[num - 1])) {
				scores[num - 1] = CORRECT;
//				correctRes++;
			}
		}
		for (int i = 0; i < M; i++) {
			if (CORRECT.equals(scores[i])) {
				correctRes += 1;
			}
			penaltiesRes += missions[i];
		}
		System.out.println(correctRes);
		System.out.println(penaltiesRes);
		scanner.close();
	}
}