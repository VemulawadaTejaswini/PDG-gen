import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		PriorityQueue<Event> pq = new PriorityQueue<Event>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] left = new int[M];
		int[] right = new int[M];
		
		for(int i = 0; i < M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int a = sc.nextInt();
			
			left[i] = l;
			right[i] = r;
			
			pq.add(new Event(a, l, true, i));
			pq.add(new Event(a, r, false, i));
		}
		
		SegmentTree tree = new SegmentTree(N+2);
		/*
		TreeSet<Integer> activeLefts = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(left[a], left[b]);
			}
		});
		TreeSet<Integer> activeRights = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(right[a], right[b]);
			}
		});
		*/
		long totalSum = 0;
		
		for(int i = 1; i <= N; i++) {
			while(!pq.isEmpty() && pq.peek().t == i && pq.peek().begin) {
				Event e = pq.poll();
				totalSum += e.a;
				//activeLefts.add(e.index);
				//activeRights.add(e.index);
				tree.update(1, 0, N+1, left[e.index], right[e.index], -e.a);
			}
			
			long dp = tree.queryM(1, 0, N+1, 0, i-1)+totalSum;
			tree.update(1, 0, N+1, i, i, dp);
			
			while(!pq.isEmpty() && pq.peek().t == i && !pq.peek().begin) {
				Event e = pq.poll();
				totalSum -= e.a;
				//activeLefts.remove(e.index);
				//activeRights.remove(e.index);
				tree.update(1, 0, N+1, left[e.index], right[e.index], e.a);
			}
		}
		
		//for(int i = 0; i <= N; i++) System.out.println(tree.queryM(1, 0, N+1, i, i));
		
		pw.println(tree.queryM(1, 0, N+1, 0, N+1));
		pw.close();
		
		
	}
	
static class SegmentTree {
		
		long[] lazy;
		long[] max;
		
		public SegmentTree(int n) {
			lazy = new long[n*4];
			max = new long[n*4];
		}
		
		public long queryM(int vert, int i, int j, int l, int r) {
			if(!intersects(i, j, l, r)) {
				return Integer.MIN_VALUE;
			}
			
			if(inside(i, j, l, r)) {
				return max[vert]+lazy[vert];
			}
			
			lazy[vert*2] += lazy[vert];
			lazy[vert*2+1] += lazy[vert];
			lazy[vert] = 0;
			
			int mid = (i+j)/2;
			long ret = Math.max(queryM(vert*2, i, mid, l, r), queryM(vert*2+1, mid+1, j, l, r));
			
			max[vert] = Math.max(max[vert*2]+lazy[vert*2], max[vert*2+1]+lazy[vert*2+1]);
			
			return ret;
		}
		
		public void update(int vert, int i, int j, int l, int r, long a) {
			if(!intersects(i, j, l, r)) {
				return;
			}
			
			if(inside(i, j, l, r)) {
				lazy[vert] += a;
				return;
			}
			
			lazy[vert*2] += lazy[vert];
			lazy[vert*2+1] += lazy[vert];
			lazy[vert] = 0;
			
			int mid = (i+j)/2;
			//System.out.println(vert + " " + i + " " + mid + " " + l + "  " + r + " " + a);
			update(vert*2, i, mid, l, r, a);
			update(vert*2+1, mid+1, j, l, r, a);
			
			max[vert] = Math.max(max[vert*2]+lazy[vert*2], max[vert*2+1]+lazy[vert*2+1]);
		}
		
	}
	
	static boolean inside(int inI, int inJ, int left, int right) {
		return (left <= inI) && (inJ <= right);
	}
	
	static boolean intersects(int i, int j, int l, int r) {
		return (j >= l) && (i <= r);
	}
	
	static class Event implements Comparable<Event> {
		
		int a, t;
		int index;
		boolean begin;
		
		public Event(int a, int t, boolean begin, int index) {
			this.a = a;
			this.t = t;
			this.begin = begin;
			this.index = index;
		}
		
		public int compareTo(Event e) {
			if(t != e.t) return t-e.t;
			return Boolean.compare(!begin, !e.begin);
		}
	}

	static class FastIO {

		//Is your Fast I/O being bad?

		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;

		public FastIO(String fileName) throws Exception {
			dis = new FileInputStream(fileName);
		}

		public FastIO(InputStream is) throws Exception {
			dis = is;
		}

		int nextInt() throws Exception {
			int ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		long nextLong() throws Exception {
			long ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		byte nextByte() throws Exception {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}

		String next() throws Exception {
			StringBuffer ret = new StringBuffer();

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}

			return ret.toString();
		}

	}
}
