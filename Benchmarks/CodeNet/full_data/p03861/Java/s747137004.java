import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long ans = b / x - a / x;
		if (a == 0) {
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}