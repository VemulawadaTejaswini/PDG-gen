import java.util.*;
// warm-up
// pushing pushing..
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		int n = sc.nextInt();
		while (n-->0) {
			l.add(sc.nextInt());
			Collections.reverse(l);
		}	
		for (int a : l) System.out.print(a+" ");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}