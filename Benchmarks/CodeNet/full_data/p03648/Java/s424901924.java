import java.util.*;

// ARC 79-D
// http://arc079.contest.atcoder.jp/tasks/arc079_b

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		long K = in.nextLong();
		
		if (K % 2 == 0) {
			System.out.printf("2\n%d %d\n", 1 + K / 2, 1 + K / 2);
		} else {
			long a = (K + 1) / 2;
			System.out.printf("2\n%d %d\n", a + 2, a - 1);
		}
	}
}
