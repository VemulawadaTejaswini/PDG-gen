import java.util.*;

// ARC 80-C
// http://arc080.contest.atcoder.jp/tasks/arc080_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int count = 0;
		int num2 = 0;
		
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			if (n % 4 == 0) {
				count++;
			} else if (n == 2) {
				num2++;
			}
		}
		
		System.out.println((num2 / 2 + count) >= N / 2 ? "Yes" : "No");
	}
}
