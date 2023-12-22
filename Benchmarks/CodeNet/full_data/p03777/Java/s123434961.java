import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0), b = sc.next().charAt(0);
		System.out.println(!(a=='H' ^ b=='H') ? 'H' : 'D');
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}