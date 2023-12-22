import java.util.*;
// Dont care if there is an optimal solution. O(n^2)
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String tok = sc.next();
		int max = Integer.MIN_VALUE;
		Set<Character> a = new HashSet<Character>();
		Set<Character> b = new HashSet<Character>();
		for (int i=0; i<tok.length()-1; i++) {
			a.add(tok.charAt(i));
			b.remove(tok.charAt(i));
			for (int j=i+1; j<tok.length(); j++) b.add(tok.charAt(j));
			Set<Character> c = new HashSet<Character>(a);
			c.retainAll(b);
			max = Math.max(c.size(), max);
		}
		System.out.println(max);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}