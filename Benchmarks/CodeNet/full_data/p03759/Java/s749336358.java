import java.util.*;
 
// ABC 19-C
// http://abc019.contest.atcoder.jp/tasks/abc019_3
 
public class Main {

	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println(b - a == c - b ? "YES" : "NO");
		
//		int t = in.nextInt();
//		int num = 1;
//		while (t-- > 0) {
//			int n = in.nextInt();
//			
//			while (!isTidy(n)) {
//				n--;
//			}
//			System.out.printf("Case #%d: %d\n", num, n);
//			num++;
//		}
	}	
	
	public static boolean isTidy(int n) {
		if (n < 10) {
			return true;
		}
		int pre = n % 10;
		n /= 10;
		int curr = n % 10;
		
		while (n > 0) {
			if (pre < curr) {
				return false;
			}
			pre = curr;
			n /= 10;
			curr = n % 10;
		}
		return true;
	}
}
