import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		long ans = f(b, x) - f(a - 1, x);
		
		System.out.println(ans);
		
		sc.close();
	}
	
	static long f(long n, long x) {
		return n >= 0 ? n / x + 1 : 0;
	}
	
}


