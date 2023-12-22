import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0;
		if(0 < x % 11 && x % 11 <= 6) ans = x / 11 * 2 + 1;
		else if(x % 11 > 6) ans = x / 11 * 2 + 2;
		else if(x % 11 == 0) ans = x / 11 * 2;
		System.out.println(ans);
	}
}
