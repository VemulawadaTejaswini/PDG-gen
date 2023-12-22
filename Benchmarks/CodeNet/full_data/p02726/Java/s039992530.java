import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		Dijkstra dk = new Dijkstra(n);
		for(int i = 0; i < n - 1; i++) {
            dk.addEdge(i, i + 1, 1);  
            dk.addEdge(i + 1, i, 1); //有向グラフの場合は消す
		}
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		dk.addEdge(x, y, 1);
		dk.addEdge(y, x, 1);
		
		int[] cnt = new int[n];
		for(int i = 0; i < n - 1; i++) {
			dk.dijkstra(i);
			for(int j = i + 1; j < n; j++) {
				long dist = dk.dist[j];
				cnt[(int)dist] ++;
			}
			/*
			for(int num = 1; num < cnt.length; num++){
				out.print(cnt[num] + " ");
			}
			out.println();
			*/
		}
		for(int i = 1; i < cnt.length; i++){
			out.println(cnt[i]);
		}
		
		out.close();
	}

public static class Dijkstra {
    int n; long[] dist;
    ArrayList<Pair>[] list;
    final long inf = Long.MAX_VALUE/10;
    public Dijkstra(int n) {
        this.n = n;
        this.dist = new long[n];
        list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
            dist[i] = inf;
        }
    }
    public void addEdge(int from, int to, long cost) {
        list[from].add(new Pair(to, cost));
    }
//始点sから各頂点への最短距離を求めてdistに格納
    public void dijkstra(int s) {
        PriorityQueue<Pair> Q = new PriorityQueue<>();
        Q.add(new Pair(s, 0));
        boolean[] used = new boolean[n];
        while (!Q.isEmpty()) {
            Pair p = Q.poll();
            if (used[p.to]) continue;
            used[p.to] = true;
            //ここ。求まった最短距離を格納する処理を書き換える
            dist[p.to] = p.cost;
            for (Pair edge : list[p.to]) {
                Q.add(new Pair(edge.to, p.cost + edge.cost));
            }
        }
    }
    class Pair implements Comparable<Pair> {
        int to; long cost;
        Pair(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
        public int compareTo(Pair p) {
            return Long.compare(cost, p.cost);
        }
    }
}

//無向グラフ用のエッジ
public static class Pair implements Comparable<Pair> {
int from; int to; long cost;
Pair(int from,int to, long cost) {
	this.from = from;
    this.to = to;
    this.cost = cost;
}
public int compareTo(Pair p) {
    return Long.compare(cost, p.cost);
}
}

static class FastScanner {
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
}