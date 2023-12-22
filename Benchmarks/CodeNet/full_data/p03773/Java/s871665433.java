import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a + b;
		
		if (ans > 24) {
			ans = ans - 24;
		}
		System.out.println(ans);
		sc.close();
	}
}
