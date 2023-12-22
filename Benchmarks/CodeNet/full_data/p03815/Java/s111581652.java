
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		long ans = x / 11 * 2;
		long amari = x % 11;
		if(amari > 6) {
			ans += 2;
		} else if(amari >= 1) {
			ans++;
		}

		System.out.println(ans);
	}
}
