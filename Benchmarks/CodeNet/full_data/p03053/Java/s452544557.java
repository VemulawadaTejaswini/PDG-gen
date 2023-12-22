
import java.util.AbstractMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         String[] a=new String[H];
         int[][] d= new int[H][W];
         int z=H*W;

         Queue<Pair<Integer,Integer>> q=new ArrayBlockingQueue<Pair<Integer,Integer>>(H*W);
         for (int i=0; i<H;i++) {
        	 a[i]=gs();
        	 for (int j=0; j<W;j++) {
            	 char c=a[i].charAt(j);
            	 if(c=='#') {
            		 q.add(new Pair<Integer, Integer>(i, j));
            		 z--;
            		 d[i][j]=0;
            	 } else {
            		 d[i][j]=Integer.MAX_VALUE;
            	 }

             }
         }

         while(z>0) {
        	 Pair<Integer,Integer> p=q.poll();
        	 int h=p.getKey();
        	 int w=p.getValue();
        	 if (h-1>=0 && d[h-1][w]==Integer.MAX_VALUE) {
        		 d[h-1][w]=d[h][w]+1;
        		 q.add(new Pair<Integer,Integer>(h-1, w));
        		 z--;
        	 }
        	 if (w-1>=0 && d[h][w-1]==Integer.MAX_VALUE) {
        		 d[h][w-1]=d[h][w]+1;
        		 q.add(new Pair<Integer,Integer>(h, w-1));
        		 z--;
        	 }
        	 if (h+1<H && d[h+1][w]==Integer.MAX_VALUE) {
        		 d[h+1][w]=d[h][w]+1;
        		 q.add(new Pair<Integer,Integer>(h+1, w));
        		 z--;
        	 }
        	 if (w+1<W && d[h][w+1]==Integer.MAX_VALUE) {
        		 d[h][w+1]=d[h][w]+1;
        		 q.add(new Pair<Integer,Integer>(h, w+1));
        		 z--;
        	 }
         }


         int ans=0;
         for (int i=0; i<H;i++) {
        	 for (int j=0; j<W;j++) {
            	 ans=Math.max(ans, d[i][j]);

             }
         }
         System.out.println(ans);
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