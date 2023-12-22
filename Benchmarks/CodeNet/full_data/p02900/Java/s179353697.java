import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		int r = 0;
        for(long i = 1; i <= gcd(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                if(isPrime(i)) r++;
            }
		}
		System.out.println(r);
	}
	public static long gcd(long x, long y) {
		if(y == 0) return x;
		else return gcd(y, x % y);
	}
	public static boolean isPrime(long n) {
		if(n <= 3) return true; // 1,2,3は素数である
		else if (n % 2 == 0) return false; // 偶数は素数ではない
		for(long i = 3; i <= Math.sqrt((double)n); i+=2) {
			if(n % i == 0) return false; // 他の値で割り切れるため素数ではない
		}
		return true; // 素数である
	}
}