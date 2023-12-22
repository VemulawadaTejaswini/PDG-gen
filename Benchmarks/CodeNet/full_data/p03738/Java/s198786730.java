import java.util.*;

// ABC 6-C
// http://abc006.contest.atcoder.jp/tasks/abc006_3
 
public class Main {
	
	public static int state = 0; // 0 ==> c1 == c2. -1 ==>  c1 < c2. 1 ==> c1 > c2
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		
		char[] c1 = in.next().toCharArray();
		char[] c2 = in.next().toCharArray();
		
		if (c1.length > c2.length) {
			state = 1;
		} else if (c1.length < c2.length) {
			state = -1;
		} else {
			solve(c1, c2, 0);
		}
		if (state == -1) {
			System.out.println("LESS");
		} else if (state == 1) {
			System.out.println("GREATER");
		} else {
			System.out.println("EQUAL");
		}
	}
	
	public static void solve(char[] a, char[] b, int index) {
		if (index == a.length) {
			return;
		}
		if (a[index] < b[index]) {
			state = -1;
			return;
		} else if (a[index] > b[index]) {
			state = 1;
			return;
		} else {
			solve(a, b, index + 1);
		}
	}
}