import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		int k = parseInt(sc.next());
		sc.close();
		TreeSet<String> set = new TreeSet<>();
		for (i = 0; i < s.length(); i++) {
			for (j = i+1; j <= s.length(); j++) {
				set.add(s.substring(i, j));
			}
		}
		String ans = null;
		for (i = 0; i < k; i++) {
			ans=set.pollFirst();
		}
		out.println(ans);
	}
}