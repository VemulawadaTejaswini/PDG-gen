import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int ans = C - (A - B) ;
		System.out.println((ans<0)?0:ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}