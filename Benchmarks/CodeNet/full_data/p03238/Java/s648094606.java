import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(n == 1 ? "Hello World" : a + b);
		scan.close();
	}
	public static void main(String[] args) {
		new Main().solve();
	}
}
