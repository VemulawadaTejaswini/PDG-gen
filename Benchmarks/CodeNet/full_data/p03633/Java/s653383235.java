import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long T = sc.nextLong();
		
		for(int i = 1; i < N; i++) {
			long t = sc.nextLong();
			long gcd = gcd(T, t);
			T = T / gcd * t;
		}
		System.out.println(T);
	}
	
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);		
	}
}
