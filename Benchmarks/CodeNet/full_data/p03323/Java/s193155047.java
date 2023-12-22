import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(a>8||b>8 ? ":(" : "Yay");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}