import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		System.out.println(b-a==c-b ? "YES" : "NO");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}