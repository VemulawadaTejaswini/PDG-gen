import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int mod = (int) (Math.pow(10, 9)+7);
		long ans = 1;
		for(int i = 1; i <= n ; i++) {
			ans *= i;
			ans%=mod;
		}
		System.out.println(ans);
	}
}