import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int q = sc.nextInt();

		boolean rev = false;
		String l = "", r = "";
		
		for (int i = 0; i < q; i++)  {
			int t = sc.nextInt();
			if (t == 1) {
				rev = !rev;
			} else {
				int f = sc.nextInt();
				char c = sc.next().charAt(0);
				if (rev == false && f == 1 || rev == true && f == 2) l += c;
				else r += c;
			}
		}
		
		StringBuffer nl = new StringBuffer(l);
		s = nl.reverse() + s + r;
		
		if (rev) {
			StringBuffer ns = new StringBuffer(s);
			System.out.println(ns.reverse());
		} else {
			System.out.println(s);
		}
		
	}

}