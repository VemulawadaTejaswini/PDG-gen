import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		System.out.println(((Math.abs(a-b)<=d) && (Math.abs(b-c)<=d)) ? "Yes" : "No");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}