import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = 100000;
		for(long i = 1 ; i * i <= 10000000000L ; i++) {
			if(n % i == 0) {
				ans = Math.min(ans, func(String.valueOf(i), String.valueOf(n / i)));
			}
		}
		System.out.println(ans);
	}

	public static int func(String a, String b) {
		return Math.max(a.length(), b.length());
	}

}
