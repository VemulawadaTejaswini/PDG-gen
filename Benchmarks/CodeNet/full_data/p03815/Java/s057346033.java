import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = x / 11;
		long ans = 0;
		long b = 0;
		if(a == 0) {
			ans = (x > 6 ? 2 : 1);
		} else {
			ans = a * 2;
			b = x % 11;
			if(b != 0) ans += (b > 6 ? 2 : 1);
		}
		System.out.println(ans);
	}
}
