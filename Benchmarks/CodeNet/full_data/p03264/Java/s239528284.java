import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		if(k % 2 == 0) System.out.println(k * k / 4);
		else System.out.println(k / 2 * (k + 1) / 2);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
