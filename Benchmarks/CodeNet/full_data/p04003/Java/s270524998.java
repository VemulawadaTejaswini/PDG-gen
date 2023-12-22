import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		int i;
		int N, M;
		int p, q, c;
		Dijkstra<Pair<Integer, Integer>> dijkstra = new Dijkstra<Pair<Integer, Integer>>();
		Pair<Integer, Integer> pc;
		Pair<Integer, Integer> qc;
		Pair<Integer, Integer> outside;

		FastScanner fs = new FastScanner();

		N = fs.nextInt();
		M = fs.nextInt();

		if(N + M > 500000) return;

		if(M == 0) {
			System.out.println(-1);
			return;
		}

		for(i=0;i<M;i++) {
			p = fs.nextInt(); q = fs.nextInt(); c = fs.nextInt();
			pc = new Pair<Integer, Integer>(p, c);
			qc = new Pair<Integer, Integer>(q, c);
			outside = new Pair<Integer, Integer>(p, -1);
			dijkstra.input(pc, outside, 0, false);
			dijkstra.input(outside, pc, 1, false);
			outside = new Pair<Integer, Integer>(q, -1);
			dijkstra.input(qc, outside, 0, false);
			dijkstra.input(outside, qc, 1, false);
			dijkstra.input(pc, qc, 0, true);
		}

		Pair<Integer, Integer> sp = new Pair<Integer, Integer>(1, -1);
		Pair<Integer, Integer> ep = new Pair<Integer, Integer>(N, -1);
		Pair<Integer, Pair<Integer, Integer>> ans = dijkstra.solve(sp, ep);

		if(ans.second == null) {
			System.out.println(-1);
		} else {
			if(ans.first < 0) {
				System.out.println(-1);
			} else {
				System.out.println(ans.first);
			}
		}

		//System.out.println(dijkstra.inputCallCount + ": " + dijkstra.inputTime/1000000 + "ms");
	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

class Dijkstra<E> {
	HashMap<E, Integer> d = new HashMap<E, Integer>();
	HashMap<E, E> prev = new HashMap<E, E>();
	PriorityQueue<Pair<E, Integer>> Q = new PriorityQueue<Pair<E, Integer>>(1000000,
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
	HashMap<E, HashMap<E, Integer>> list = new HashMap<E, HashMap<E, Integer>>();

	Dijkstra() {

	}

	public long inputTime = 0;
	public long inputCallCount = 0;

	void input(E u, E v, int cost, boolean isDig) {
		//inputCallCount++;
		//long s = System.nanoTime();
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
		//long e = System.nanoTime();
		//inputTime += (e - s);
	}

	Pair<Integer, E> solve(E start, E end) {
		d.put(start, 0);
		Q.remove(start);
		Q.add(new Pair<E, Integer>(start, d.get(start)));

		while(!Q.isEmpty()) {
			//E u = Q.pollFirst().first;
			E u = Q.poll().first;
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
