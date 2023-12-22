import java.util.*;
public class Main {
	
	public static long gcd(long a, long b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	public static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = sc.nextLong();
		for(int i = 1; i < N; i++)
			ans = lcm(ans, sc.nextLong());
		System.out.println(ans);
	}

}