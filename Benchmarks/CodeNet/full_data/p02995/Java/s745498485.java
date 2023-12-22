import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong()-1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long l = lcm(c,d);

		long countA = a - (a/c + a/d - a/l);
		long countB = b - (b/c + b/d - b/l);
		
		long ans = countB - countA;
		System.out.println(ans);
		
		
		sc.close();
	}
	
	public static long lcm(long a, long b)  {
		long c = a * b;
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		
		return c/b;
	}
	
}
