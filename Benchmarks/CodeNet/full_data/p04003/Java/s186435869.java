import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		int i;
		int N, M;
		int p;
		int q;
		int c;
		Dijkstra<Pair<Integer, Integer>> dijkstra = new Dijkstra<Pair<Integer, Integer>>();

		buf = br.readLine();
		input = buf.split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		long s = System.currentTimeMillis();
		long e;

		for(i=0;i<M;i++) {
			buf = br.readLine();
			input = buf.split(" ");
			p = Integer.parseInt(input[0]);
			q = Integer.parseInt(input[1]);
			c = Integer.parseInt(input[2]);
			Pair<Integer, Integer> pc = new Pair<Integer, Integer>(p, c);
			Pair<Integer, Integer> qc = new Pair<Integer, Integer>(q, c);
			Pair<Integer, Integer> outside = new Pair<Integer, Integer>(p, -1);
			dijkstra.input(pc, outside, 0, false);
			dijkstra.input(outside, pc, 1, false);
			outside = new Pair<Integer, Integer>(q, -1);
			dijkstra.input(qc, outside, 0, false);
			dijkstra.input(outside, qc, 1, false);
			dijkstra.input(pc, qc, 0, true);
		}

		e = System.currentTimeMillis();
		System.out.println((e - s) + "ms");

		Pair<Integer, Integer> sp = new Pair<Integer, Integer>(1, -1);
		Pair<Integer, Integer> ep = new Pair<Integer, Integer>(N, -1);
		Pair<Integer, Pair<Integer, Integer>> ans = dijkstra.solve(sp, ep);

		e = System.currentTimeMillis();
		System.out.println((e - s) + "ms");

		if(ans.second == null) {
			System.out.println(-1);
		} else {
			if(ans.first < 0) {
				System.out.println(-1);
			} else {
				System.out.println(ans.first);
			}
		}
	}

}

class Dijkstra<E> {
	HashMap<E, Integer> d = new HashMap<E, Integer>(200000);
	HashMap<E, E> prev = new HashMap<E, E>(200000);

	TreeSet<Pair<E, Integer>> Q = new TreeSet<Pair<E, Integer>>(
			new Comparator<Pair<E, Integer>>() {
				@Override
				public int compare(Pair<E, Integer> o1, Pair<E, Integer> o2) {
					if(o1.second < o2.second) return -1;
					else if(o1.second > o2.second) return 1;
					else {
						if(o1.equals(o2)) return 0;
						else return 1;
					}
				}
			});

	/*
	PriorityQueue<Pair<E, Integer>> Q = new PriorityQueue<Pair<E, Integer>>(500000,
			new Comparator<Pair<E, Integer>>() {
				@Override
				public int compare(Pair<E, Integer> o1, Pair<E, Integer> o2) {
					if(o1.second < o2.second) return -1;
					else if(o1.second > o2.second) return 1;
					else {
						if(o1.equals(o2)) return 0;
						else return 1;
					}
				}
			});
			*/
	HashMap<E, HashMap<E, Integer>> list = new HashMap<E, HashMap<E, Integer>>(500000);

	Dijkstra() {

	}

	void input(E u, E v, int cost, boolean isDig) {
		if(!list.containsKey(u)) {
			list.put(u, new HashMap<E, Integer>());
			d.put(u, Integer.MAX_VALUE);
			prev.put(u, null);
			Q.add(new Pair<E, Integer>(u, d.get(u)));
		}
		list.get(u).put(v, cost);

		if(isDig) {
			if(!list.containsKey(v)) {
				list.put(v, new HashMap<E, Integer>());
				d.put(v, Integer.MAX_VALUE);
				prev.put(v, null);
				Q.add(new Pair<E, Integer>(v, d.get(v)));
			}
			list.get(v).put(u, cost);
		}
	}

	Pair<Integer, E> solve(E start, E end) {
		d.put(start, 0);
		Q.remove(start);
		Q.add(new Pair<E, Integer>(start, d.get(start)));

		while(!Q.isEmpty()) {
			E u = Q.pollFirst().first;
			//E u = Q.poll().first;
			int alt;
			for(E v : list.get(u).keySet()) {
				alt = d.get(u) + list.get(u).get(v);
				if(d.get(v) > alt) {
					d.put(v, alt);
					prev.put(v, u);
					Q.add(new Pair<E, Integer>(v, alt));
				}
			}
		}

		return new Pair<Integer, E>(d.get(end), prev.get(end));
	}
}

class Pair<F, S> {
    public final F first;
    public final S second;

    Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals (Object obj) {
        if (! (obj instanceof Pair))
            return false;
        @SuppressWarnings("unchecked")
		Pair<F, S> pair = (Pair<F, S>) obj;
        return (first.equals (pair.first) && second.equals (pair.second));
    }

    @Override
    public int hashCode () {
        return first.hashCode () ^ second.hashCode ();
    }

    @Override
    public String toString() {
    	return "(" + first.toString() + "," + second.toString() + ")";
    }
}
