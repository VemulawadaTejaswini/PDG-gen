import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		long a;
		long b;
		HashMap<Long, Long> ab = new HashMap<>();
		for (i = 0; i < n; i++) {
			a = parseLong(sc.next());
			b = parseLong(sc.next());
			if(ab.get(a)==null) {
				ab.put(a, b);
			} else {
				ab.put(a, ab.get(a)+b);
			}
		}
		sc.close();
		ArrayList<Long> abl = new ArrayList<>(ab.keySet());
		Collections.sort(abl);
		long cnt=0L;
		long ans=0L;
		for (Long ll:abl) {
			if(k<=cnt+ab.get(ll)) {
				ans = ll;
				break;
			}
			cnt+=ab.get(ll);
		}
		out.println(ans);
	}
}
