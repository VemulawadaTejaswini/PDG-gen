

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int X=gi();
         int Y=gi();
         List<Edge>[] G=new ArrayList[N];
         for (int i=0; i<N;i++) {
        	 G[i]=new ArrayList<Edge>();
         }
         for (int i=0; i<N-1;i++) {
        	 G[i].add(new Edge(i, i+1, 1l));
        	 G[i+1].add(new Edge(i+1, i, 1l));
         }
         G[X-1].add(new Edge(X-1, Y-1, 1l));
    	 G[Y-1].add(new Edge(Y-1, X-1, 1l));

    	 long[][] d=new long[N][N];
    	 for (int i=0; i<N;i++) {
    		 for (int j=0; j<N;j++) {
        		 if(i==j) {
        			 d[i][j]=0;
        		 } else {
        			 d[i][j]=Long.MAX_VALUE;
        		 }
        	 }
    	 }
    	 for (int i=0; i<N;i++) {
    	     PriorityQueue<Pair<Long, Integer>> q=new PriorityQueue<Pair<Long, Integer>>();
    	     q.add(new Pair<Long,Integer>(0l, i));
    	     while(!q.isEmpty()) {
    	    	 Pair<Long, Integer> p=q.poll();
    	    	 int v=p.getValue();
    	    	 long cost=p.getKey();
    	    	 if(d[i][v]<cost)continue;
    	    	 for (int j=0; j<G[v].size(); j++) {
    	    		 Edge e=G[v].get(j);
    	    		 if(d[i][e.to]>d[i][v]+e.cost && e.cost!=Integer.MAX_VALUE) {
    	    		     d[i][e.to]=Math.min(d[i][e.to], d[i][v] + e.cost);
    	    		     q.add(new Pair<Long,Integer>(d[i][e.to], e.to));
    	    		 }
    	    	 }
    	     }
    	 }

    	 int[] c=new int[N-1];
    	 for (int i=0; i<N;i++) {
    		 for (int j=i+1; j<N;j++) {
        	     long ind=d[i][j]-1;
        	     c[(int)ind]++;
        	 }
    	 }

    	 StringBuilder sb=new StringBuilder();
    	 for (int i=0; i<N-1;i++) {
    		 sb.append(c[i]);
    		 sb.append(System.lineSeparator());
    	 }
         System.out.println(sb);
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