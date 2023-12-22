import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int o = 0; sc.nextInt();
		String tok = sc.next();
		StringBuilder ob = new StringBuilder();
		StringBuilder cb = new StringBuilder();
		for (char ch : tok.toCharArray()) {
			if (ch==')' && o==0) ob.append("(");
			else if (ch==')' && o>0) o--;
			if (ch=='(') o++;
		}
		while (o-->0) cb.append(")");
		System.out.println(ob+tok+cb);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}