import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base = sc.nextInt();
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		if (n <= 2) {
		    min2 = base;
		    min1 = base;
		}
		int another = 0;
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    if (i == 1) {
		        another = x;
		    } else {
		        another = gcd(x, another);
		    }
		    int g = gcd(base, x);
		    if (min1 > g) {
		        min2 = min1;
		        min1 = g;
		    } else if (min2 > g) {
		        min2 = g;
		    }
		}
		System.out.println(Math.max(min2, another));
	}
	
	static int gcd(int x, int y) {
	    if (x % y == 0) {
	        return y;
	    }
	    return gcd(y, x % y);
	}
}
