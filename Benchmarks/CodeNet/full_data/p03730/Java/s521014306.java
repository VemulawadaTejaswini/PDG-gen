import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		boolean answer = false;
		
		for (int i = 1; i <= Math.max(a, b); i++) {
			if ((i * a - c) % b == 0) {
				answer = true;
				break;
			}
		}
		System.out.println(answer ? "YES": "NO");
	}
}