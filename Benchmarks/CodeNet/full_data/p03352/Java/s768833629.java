import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
			for (int k = 2 ; Math.pow(i, k) <= n ; k++) {
				int p = (int)Math.pow(i, k);
				if (i == 1 ) {
					a = 1;
					break;
				} else if (p <= n && p > a) {
					a = p;
				}
			}
		}
		System.out.println(a);
	}
}
