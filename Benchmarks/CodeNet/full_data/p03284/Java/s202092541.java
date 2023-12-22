import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(n % k == 0 ? 0 : 1);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
