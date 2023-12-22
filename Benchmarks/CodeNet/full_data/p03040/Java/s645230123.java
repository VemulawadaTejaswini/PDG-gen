import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		PriorityQueue<Int2> pq1 = new PriorityQueue<Int2>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		int x = 0;
		long v = 0;
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int y = Integer.parseInt(sa[0]);
			if (y == 1) {
				int a = Integer.parseInt(sa[1]);
				int b = Integer.parseInt(sa[2]);
				Int2 o = new Int2();
				o.i = a;
				pq1.add(o);
				pq2.add(a);
				if (pq1.peek().i != pq2.peek()) {
					Int2 r = pq1.poll();
					int s = pq2.poll();
					v += Math.abs(r.i - s);
					int t = s;
					s = r.i;
					r.i = t;
					pq1.add(r);
					pq2.add(a);
				}
				x = pq1.peek().i;
				v += b;
			} else {
				System.out.println(x + " " + v);
			}
		}
	}

	static class Int2 implements Comparable<Int2> {
		int i;

		public int compareTo(Int2 o) {
			return o.i - i;
		}
	}
}

