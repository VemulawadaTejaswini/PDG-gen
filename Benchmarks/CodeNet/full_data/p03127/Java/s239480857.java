import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 1; i < n; i++) {
		    x = gcd(x, sc.nextInt());
		}
		System.out.println(x);
	}
	
	static int gcd(int x, int y) {
	    if (x % y == 0) {
	        return y;
	    } else {
	        return gcd(y, x % y);
	    }
	}
}
