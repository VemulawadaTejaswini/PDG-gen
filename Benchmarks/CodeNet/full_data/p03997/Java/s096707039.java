import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		System.out.println((int)(0.5*(a[0]+a[1])*a[2]));
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
