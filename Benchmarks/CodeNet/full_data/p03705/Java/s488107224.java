import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();
		
		long answer = N * (B - A) + 2 * A - 2 * B + 1;
		if (answer < 0) {
			answer = 0;
		}
		
		System.out.println(answer);
	}
}