import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		String o = sc.next(), e = sc.next();
		for (int i=0; i<e.length(); i++) s.append(o.charAt(i)).append(e.charAt(i));
		if (o.length()-e.length()==1) s.append(o.charAt(o.length()-1));
		System.out.println(s);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}