import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),
			b = sc.nextInt(),
			c = sc.nextInt(),
			k = sc.nextInt(),
			ans = 0;
		if(a >= b && a >= c) {
			ans = b + c + a * (int)Math.pow(2, k);
		} else if(b >= a && b >= c) {
			ans = a + c + b * (int)Math.pow(2, k);
		} else {
			ans = a + b + c * (int)Math.pow(2, k);
		}
		System.out.println(ans);
	}
}