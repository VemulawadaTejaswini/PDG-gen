import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int ans = (a * b) / gcd(Math.max(a, b), Math.min(a, b));
		System.out.println(ans);
	}
	public static int gcd(int a, int b) {
		if(a % b == 0) return b;
		else return gcd(b, a % b);
	}
}