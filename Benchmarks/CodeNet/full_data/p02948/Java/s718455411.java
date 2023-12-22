import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int a;
		int b;
		HashMap<Integer, ArrayList<Integer>> ab = new HashMap<>();
		for(i=0;i<n;i++) {
			a = parseInt(sc.next());
			b = parseInt(sc.next());
			if(!ab.containsKey(a)) {
				ab.put(a, new ArrayList<Integer>());
			}
			ab.get(a).add(b);
		}
		sc.close();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) {
				return s2.intValue() - s1.intValue();
			}
		});
		int ans=0;
		Integer po;
		j=0;
		for(i=1;i<=m;i++) {
			if(ab.get(i) != null) {
				pq.addAll(ab.get(i));
			}
			po = pq.poll();
			if(po != null) {
				ans += po;
			}
		}
		out.println(ans);
	}
}
