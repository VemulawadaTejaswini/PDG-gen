import java.util.*;

// ABC 47-C
// http://abc047.contest.atcoder.jp/tasks/arc063_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c = in.next().toCharArray();
		
		int answer1 = 0;
		int answer2 = 0;
		
		char cc = c[0];
		for (int i = 1; i < c.length; i++) {
			if (cc != c[i]) {
				answer1++;
				cc = c[i];
			}
		}
		
		cc = c[c.length - 1];
		for (int i = c.length - 2; i >= 0; i--) {
			if (cc != c[i]) {
				answer2++;
				cc = c[i];
			}
		}
		
		System.out.println(Math.min(answer1, answer2));
	}
}