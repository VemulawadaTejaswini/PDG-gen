import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		HashSet<Integer> l = new HashSet<>(); 
		HashSet<Integer> r = new HashSet<>(); 
		int mx = 0;
		for (i = 1; i < n; i++) {
			for (j = 0; j < n; j++) {
				if(j<i) {
					l.add(s[j]-'0');
				} else {
					r.add(s[j]-'0');
				}
			}
			l.retainAll(r);
			if(mx < l.size()) mx = l.size();
			l.clear();
			r.clear();
		}
		out.println(mx);
	}
}
