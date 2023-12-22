import java.util.*;
// warm-up
// Solution Ripped from Editorial for self reference
// Cant get a clever brute force solution than this
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder path = new StringBuilder();
		int sx=sc.nextInt(), sy=sc.nextInt(), tx=sc.nextInt(), ty=sc.nextInt();
		int dx=tx-sx, dy=ty-sy;
		// Path 1
		path.append("U".repeat(dy)).append("R".repeat(dx));
		// Path 2
		path.append("D".repeat(dy)).append("L".repeat(dx));
		// Path 3
		path.append("L").append("U".repeat(dy+1)).append("R".repeat(dx+1)).append("D");
		// Path 4
		path.append("R").append("D".repeat(dy+1)).append("L".repeat(dx+1)).append("U");
		System.out.println(path);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}
