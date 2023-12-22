import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = solve();
		System.out.println(ans);
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if (a == b) return c;
		if (a == c) return b;
		if (b == c) return a;
		return a;
	}
}