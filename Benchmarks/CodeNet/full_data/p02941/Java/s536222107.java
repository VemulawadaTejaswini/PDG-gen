import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] targets = new int[n];
		int[] values = new int[n];
		PriorityQueue<Unit> pq = new PriorityQueue<Unit>(new Comparator<Unit>() {
		public int compare(Unit u1, Unit u2) {
			return (u2.value - u2.target) - (u1.value - u1.target);
		}
		});
		for (int i = 0; i < n; i++) {
			targets[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
			pq.add(new Unit(i, targets[i], values[i]));
		}
		int count = 0;
		while (pq.size() > 0) {
			Unit u = pq.poll();
			int a = values[(u.idx - 1 + n) % n];
			int b = values[(u.idx + 1) % n];
			if (u.value - targets[u.idx] < a + b) {
				System.out.println(-1);
				return;
			}
			int c = (u.value - targets[u.idx]) / (a + b);
			u.value = targets[u.idx] + (u.value - targets[u.idx]) % (a + b);
          values[u.idx] = u.value;
			if (u.value > targets[u.idx]) {
				pq.add(u);
			}
			count += c;
		}
		System.out.println(count);
	}
	
	static class Unit {
		int idx;
		int target;
		int value;
		
		public Unit(int idx, int target, int value) {
			this.idx = idx;
			this.target = target;
			this.value = value;
		}
      
      public String toString() {
        return "idx:" + idx + " value:" + value;
      }
	}
}
