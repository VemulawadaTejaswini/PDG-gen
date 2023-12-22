import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), n=N;
		double K = sc.nextDouble(), t=0;
		Map<Double, Double> m = new HashMap<Double, Double>();
		Queue<Double> minQueue = new PriorityQueue<Double>();
		while (n-->0) {
			double b = sc.nextDouble(), c = sc.nextDouble();
			if (!m.containsKey(b)) minQueue.add(b);
			m.put(b,m.get(b)==null ? c : m.get(b)+c);
		}
		Iterator<Double> i = minQueue.iterator();
		while (i.hasNext()) {
			double k = i.next();
			if (t==K||t+m.get(k)>=K) {
				System.out.println((int)k); System.exit(0);				
			}
			t+=m.get(k);
			i.remove();
		}
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
