import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long num = gcd(a,b);
		long cnt = 0;

		for (int i = 2; i <= num; i++) {
			if (num%i != 0) {
				continue;
			} else {
				while(num%i == 0) {
					num = num/i;
				}
				cnt++;
			}
		}
		System.out.println(cnt + 1);
	}

	public static long gcd(long a, long b) {
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
