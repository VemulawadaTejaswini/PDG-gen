import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		for (String e : sc.nextLine().split(" ")) s.append(e.charAt(0));
		System.out.println(s.toString().toUpperCase());
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}