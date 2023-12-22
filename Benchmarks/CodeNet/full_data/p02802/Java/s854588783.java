import java.util.Scanner;

public class Main {
	protected static final String CORRECT = "AC";
	protected static final String WRONG = "WA";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] missions = new int[N];
		int[] scores = new int[N];
		int correctRes = 0;
		int penaltiesRes = 0;
		for (int i = 0; i < M; i++) {
			int num = scanner.nextInt() - 1;
			String score = scanner.next();
			if (scores[num] == 1) {
				
			}else if (score.equals(CORRECT)) {
				correctRes ++;
				scores[num] = 1;
			}else {
				missions[num] ++;
			}
		}
		for (int i = 0; i < N; i++) {
			if (scores[i] == 1) {
				penaltiesRes += missions[i];
			}
		}
		System.out.println(correctRes);
		System.out.println(penaltiesRes);
		scanner.close();
	}
}