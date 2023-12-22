
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int uf[] = new int[n];
		for (int i = 0; i < n; i++) {
			uf[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			uf[uf[x]] = uf[y];
		}
		// System.err.println(Arrays.toString(uf));
		for (int i = 0; i < n; i++) {
			find(uf, i);
		}
		// System.err.println(Arrays.toString(uf));

		Map<Integer, List<Integer>> costs = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n; i++) {
			List<Integer> pq;
			if (costs.containsKey(uf[i])) {
				pq = costs.get(uf[i]);
			} else {
				pq = new LinkedList<Integer>();
			}
			pq.add(a[i]);
			costs.put(uf[i], pq);
		}

		PriorityQueue<E> queue = new PriorityQueue<E>();

		int other[] = new int[n - costs.keySet().size()];
		int oi = 0;
		int res = 0;
		for (List<Integer> list : costs.values()) {
			// System.err.println("new E");
			// System.err.println(" "+ list.toString());

			E e = new E();
			e.pq = list.toArray(new Integer[0]);
			Arrays.sort(e.pq);
			e.priority = e.pq[0];
			queue.add(e);

			for(int i = 1; i < e.pq.length ; i++){
				other[oi] = e.pq[i];
				oi ++;
			}
			
			res += e.pq[0];

			// System.err.println(Arrays.toString(e.pq));
		}

		Arrays.sort(other);
		if(other.length < (costs.keySet().size() -1)* 2 - costs.keySet().size()){
			System.out.println("Impossible");
			return;
		}
		for(int i =0 ; i <  (costs.keySet().size() -1)* 2 - costs.keySet().size(); i++){
			res += other[i];
		}
		System.out.println(res);
		
	}

	class E implements Comparable<E> {
		int priority;
		Integer[] pq;

		@Override
		public int compareTo(E o) {
			return this.priority - o.priority;
		}
	}

	int find(int[] uf, int i) {
		if (i != uf[i]) {
			uf[i] = find(uf, uf[i]);
		}
		return uf[i];
	}
}
