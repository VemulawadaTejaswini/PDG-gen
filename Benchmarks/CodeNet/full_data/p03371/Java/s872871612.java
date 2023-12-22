import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		long ans = 0;
		if(a + b <= c * 2) {
			ans = (long)x * a + (long)y * b;
		}
		else {
			if(x>=y) {
				ans = (long)y * 2 * c + (long)(x - y) * Math.min(2*c,a);
			}
			else {
				ans = (long)x * 2 * c + (long)(y - x) * Math.min(2*c,b);				
			}
		}
		System.out.println(ans);
	}
}