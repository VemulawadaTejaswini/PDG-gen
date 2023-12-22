import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = scan.nextInt();
		System.out.println(n - i + 1);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
