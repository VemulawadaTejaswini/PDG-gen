import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<String, Integer> s = new HashMap<>();
		String str;
		Integer cnt;
		for (i = 0; i < n; i++) {
			str = sc.next();
			if((cnt = s.get(str)) == null) {
				s.put(str, 1);
			} else {
				s.put(str, cnt+1);
			}
		}
		int m = parseInt(sc.next());
		for (i = 0; i < m; i++) {
			str = sc.next();
			if((cnt = s.get(str)) == null) {
				s.put(str, -1);
			} else {
				s.put(str, cnt-1);
			}
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<>(s.values());
		Collections.sort(list, Comparator.reverseOrder());
		out.println(list.get(0)<0?0:list.get(0));
	}
}
