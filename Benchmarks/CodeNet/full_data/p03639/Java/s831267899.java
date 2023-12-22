import java.util.*;

// ARC 80-C
// http://arc080.contest.atcoder.jp/tasks/arc080_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			if (n % 4 == 0) {
				count++;
			}
		}
		
		System.out.println(count >= N / 2 ? "Yes" : "No");
	}
}
