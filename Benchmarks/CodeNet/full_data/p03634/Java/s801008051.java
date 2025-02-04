
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[][] G=new long[N][N];
	    for(int i=0; i<N;i++) {
	    	Arrays.fill(G[i], Long.MAX_VALUE);
	    	G[i][i]=0;
	    }
	    for (int i=0; i<N-1;i++) {
	    	int a=gi()-1;
	    	int b=gi()-1;
	    	long c=gl();
	    	G[a][b]=c;
	    	G[b][a]=c;
	    }

	    int Q=gi();
	    int K=gi();

	    long[] d=new long[N];
	    for (int i=0; i<N;i++) {
	    	d[i]=Long.MAX_VALUE;
	    }
	    d[K-1]=0;
	    PriorityQueue<Pair<Long, Integer>> que=new PriorityQueue<Pair<Long, Integer>>();
	    Pair<Long, Integer> sp= new Pair<Long, Integer>(0l,K-1);
        que.add(sp);
	    while(!que.isEmpty()) {
	    	Pair<Long, Integer> p=que.poll();
	    	int v=p.getValue();
	    	if(d[v]<p.getKey())continue;
	    	for(int i=0; i<G[v].length;i++) {
	    		long cost=G[v][i];
	    		if(d[v] != Long.MAX_VALUE && cost!=Long.MAX_VALUE && d[i]>d[v]+cost) {
	    			d[i]=d[v]+cost;
	    			que.add(new Pair<Long, Integer>(d[i], i));
	    		}
	    	}
	    }

	    StringBuilder sb=new StringBuilder();
	    for(int i=0; i<Q;i++) {
	    	int x=gi()-1;
	    	int y=gi()-1;
	    	long ans=d[x]+d[y];
	    	sb.append(ans);
	    	sb.append(System.lineSeparator());
	    }

	    System.out.println(sb);


        //System.out.println(ns);
	}

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
		/** serialVersionUID. */
	    private static final long serialVersionUID = 6411527075103472113L;

	    public Pair(final K key, final V value) {
	        super(key, value);
	    }

		@Override
		public int compareTo(Pair<K, V> o) {

			Comparable key = (Comparable)this.getKey();
			Comparable key2 = (Comparable)o.getKey();

			return key.compareTo(key2);
		}

	}

	public static class Edge {
	    private int from;
	    private int to;
	    private long cost;

	    public Edge(int f, int t, long c) {
	    	this.from=f;
	    	this.to=t;
	    	this.cost=c;
	    }
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}