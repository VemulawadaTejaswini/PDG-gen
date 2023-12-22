import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n * n * n);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
