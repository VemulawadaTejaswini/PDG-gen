import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		ArrayList<Long> p = new ArrayList<>();
		ArrayList<Long> m = new ArrayList<>();
		long a;
		for(i=0;i<n;i++) {
			a = parseLong(sc.next());
			if(a<0) m.add(a);
			else p.add(a);
		}
		sc.close();
		Collections.sort(p, Comparator.reverseOrder());
		Collections.sort(m);
		long p1=0;
		long p2=0;
		if(p.size()==1 && m.size()==1) {
			p1=p.get(0);
			p2=m.get(0);
		} else {
			for (Long ll : p) {
				if(p1<p2) p1 += ll;
				else p2 += ll;
			}
			for (Long ll : m) {
				if(p1<p2) p2 += ll;
				else p1 += ll;
			}
		}
		out.println(abs(p1-p2));
	}
}
