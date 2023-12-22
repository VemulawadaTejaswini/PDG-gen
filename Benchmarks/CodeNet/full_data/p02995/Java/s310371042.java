import java.util.*;
public class Main {

	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	
	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextInt();
		long D = sc.nextInt();
		System.out.println((B-A+1)-B/C+(A-1)/C-B/D+(A-1)/D+B/lcm(C,D)-(A-1)/lcm(C,D)); 
	}

}
