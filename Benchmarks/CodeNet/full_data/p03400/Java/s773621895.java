import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt(), t = 0, no = N;
		while (no-->0) {
			int a = sc.nextInt();
			t+=a==1 ? D : (D%a==0) ? D/a : (D/a)+1;
		}
		System.out.println(t+X);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}