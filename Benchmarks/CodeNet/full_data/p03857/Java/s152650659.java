import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
	public static class UnionFind {
		private int[] parent;
		private byte[] rank;
		private int count;

		public UnionFind(int n) {
			if (n<0) throw new IllegalArgumentException();
			count = n;
			parent = new int[n];
			rank = new byte[n];
			for(int i=0; i<n; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}

		public int find(int p) {
			while(p!=parent[p]) {
				parent[p] = parent[parent[p]];
				p = parent[p];
			}
			return p;
		}

		public int count() { return count; }
		public boolean connected(int p, int q) { return find(p) == find(q); }

		public boolean union(int p, int q) {
			int rootP = find(p);
			int rootQ = find(q);
			if (rootP==rootQ) return false;
			if(rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
			else if(rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
			else {
				parent[rootQ] = rootP;
				rank[rootP]++;
			}
			count--;
			return true;
		}

		public HashMap<Integer, ArrayList<Integer>> get() {
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for(int i=0; i<parent.length; i++) {
				int p = find(i);
				ArrayList<Integer> tmp;
				if(map.get(p) == null) {
					tmp = new ArrayList<Integer>();
				} else {
					tmp = map.get(p);
				}
				tmp.add(i);
				map.put(p, tmp);
			}
			return map;
		}
	}


	public static void main(String[] args) {
		FS r = new FS();
		int n = r.nextInt();
		int k = r.nextInt();
		int l = r.nextInt();
		int[] ans = new int[n];
		boolean[] checked = new boolean[n];
		UnionFind u1 = new UnionFind(n);
		for(int i=0; i<k; i++) {
			int p = r.nextInt()-1;
			int q = r.nextInt()-1;
			u1.union(p, q);
		}
		UnionFind u2 = new UnionFind(n);
		for(int i=0; i<l; i++) {
			int p = r.nextInt()-1;
			int q = r.nextInt()-1;
			u2.union(p, q);
		}
		HashMap<Integer, ArrayList<Integer>> g1 = u1.get();
		for(int i=0; i<n; i++) {
			if(checked[i]) continue;
			ArrayList<Integer> road = g1.get(u1.find(i));
			HashMap<Integer, ArrayList<Integer>> rail = new HashMap<Integer, ArrayList<Integer>>();
			for(int j: road) {
				int pp = u2.find(j);
				if(!rail.containsKey(pp)) {
					rail.put(pp, new ArrayList<Integer>());
				}
				ArrayList<Integer> tmp = rail.get(pp);
				tmp.add(j);
				rail.put(pp, tmp);
			}
			for(Map.Entry<Integer, ArrayList<Integer>> e : rail.entrySet()) {
				ArrayList<Integer> target = e.getValue();
				for(int m : target) {
					ans[m] = target.size();
					checked[m] = true;
				}
			}
		}
		String[] ansPrint = new String[n];
		for(int i=0; i<n; i++) {
			ansPrint[i] = String.valueOf(ans[i]);
		}
		System.out.println(String.join(" ", ansPrint));
	}

	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
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

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}