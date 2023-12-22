import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt(),D = sc.nextInt();
		System.out.println((A+B==C+D) ? "Balanced" : (A+B<C+D) ? "Right" : "Left");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}