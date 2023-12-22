import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	static long count = 0;
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		solve(a, b, c);
		System.out.println(count);
	}
	
	public static void solve(int a, int b, int c) {
		if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
			return;
		}
		if (a == b && b == c && a == c) {
			count = -1;
		} else {
			count++;
			solve(b / 2 + c / 2, a / 2 + c / 2, a / 2 + b / 2);
		}
	}
}