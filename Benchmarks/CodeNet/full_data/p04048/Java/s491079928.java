import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long a = x;
		long b = n - x;
		long ans = 0;
		while(a > 0 && b > 0) {
			if (a <= b) {
				long r = b % a;
				ans += (b - r) * 3;
				b = r;
			}else{
				long r = a % b;
				ans += (a - r) * 3;
				a = r;
			}
		}
		System.out.println(ans);
	}
}
