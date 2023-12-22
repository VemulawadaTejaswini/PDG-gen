import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int ans = Integer.MAX_VALUE;
		if(y >= x) {
			ans = Math.min(y - x, ans);
		}
		if(y >= -x) {
			if(y + x > 0) {
				ans = Math.min(1 + y + x, ans);
			}
		}
		if(-y >= x) {
			if(- x - y > 0) {
				ans = Math.min(1 - x  - y, ans);
			}
		}
		if(-y >= -x) {
			if(x - y > 0) {
				ans = Math.min(x - y + 2, ans);
			}
		}
		System.out.println(ans);
	}
}
