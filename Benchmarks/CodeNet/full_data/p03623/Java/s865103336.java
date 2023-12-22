import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.abs(x-a)>Math.abs(x-b) ? 'B' : 'A');
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}