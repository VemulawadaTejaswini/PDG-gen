import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		a--;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long countA = a - (a/c + a/d - a/lcm(c,d));
		long countB = b - (b/c + b/d - b/lcm(c,d));
		
		long ans = countB - countA;
		System.out.println(ans);
		
		
		sc.close();
	}
	
	public static int lcm(long a, long b)  {
		long c = a * b;
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		
		return (int)(c/b);
	}
	
}
