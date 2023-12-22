import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x = Math.max(Math.abs(a - c), Math.abs(b - d));
		int y = Math.min(Math.abs(a - c), Math.abs(b - d));
		int wari = gcd(x, y);
		x /= wari;
		y /= wari;
		System.out.println(wari * (Math.min(x, y) - 1 + Math.max(x, y)));
	}
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}