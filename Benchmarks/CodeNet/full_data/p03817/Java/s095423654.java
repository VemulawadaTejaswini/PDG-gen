import java.util.Scanner;

public class Main {

	//6 -> 5 -> 6 ...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0;
		long a = x / 11;
		x -= a * 11;
		ans += a * 2;
		if (x > 0) {
			x -= 6;
			ans++;
		}
		if (x > 0) {
			x -= 5;
			ans++;
		}
		System.out.println(ans);
	}

}
