import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt();
		System.out.println(A>B ? (B==1) ? "Bob" : "Alice" : (A==B) ? "Draw" : (A==1) ? "Alice" : "Bob");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}