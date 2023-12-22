import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean f = true;
		StringBuilder s = new StringBuilder();
		Set<Character> t = new TreeSet<Character>();
		int[] a = new int[256];
		while (n-->0) {
			Set<Character> o = new TreeSet<Character>();
			int[] b = new int[256];
			for (char ch : sc.next().toCharArray()) {
				o.add(ch);
				if (f) a[ch]++;
				else b[ch]++; 
			}
			if (f) { t.addAll(o); f=false; }
			else t.retainAll(o);
			for (char ch : t) if (a[ch]!=0 && b[ch]!=0) a[ch] = Math.min(a[ch], b[ch]);
		}
		for (char ch : t) while (a[ch]-->0) s.append(ch);
		System.out.println(s);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}