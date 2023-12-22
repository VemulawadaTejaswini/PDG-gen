import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = a.compareTo(b);
		System.out.println(ans >= 0 ? ans == 0?"EQUAL":"GREATER":"LESS");
	}
}
