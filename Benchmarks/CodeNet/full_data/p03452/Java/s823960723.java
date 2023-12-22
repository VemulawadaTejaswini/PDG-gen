
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         long[] R=new long[M];
         long[] L=new long[M];
         long[] D=new long[M];
         Map<Pair<Long,Long>, Long> tm=new HashMap<Pair<Long,Long>, Long>();
         long[] x=new long[N];
         Pair<Long,Long>[] pa=new Pair[M];

         for (int i=0; i<N;i++) {
             x[i]=Long.MAX_VALUE;
         }
         for (int i=0; i<M;i++) {
             long l=gl()-1;
             long r=gl()-1;
             long d=gl();
             if(l>r) {
            	 l^=r;
            	 r^=l;
            	 l^=r;
            	 d=-d;
             }
             Pair<Long,Long> p=new Pair<Long,Long>(l,r);
             tm.put(p, d);
             pa[i]=p;
         }

         Arrays.parallelSort(pa);

         boolean f=true;
         for (int i=0; i<M;i++) {

        	 Pair<Long,Long> p=pa[i];
        	 long l=p.getKey();
        	 long r=p.getValue();
        	 long d=tm.get(p);
        	 if(x[(int)l]!=Long.MAX_VALUE) {
        		 if(x[(int)r]!=Long.MAX_VALUE) {
        			 if(x[(int)r] - x[(int)l] != d) {
        				 f=false;
        				 break;
        			 }
        		 } else {
        			 x[(int)r]=x[(int)l]+d;
        		 }
        	 } else {
        		 if(x[(int)r]!=Long.MAX_VALUE) {
        			 x[(int)l]=x[(int)r]-d;
        		 } else {
        			 x[(int)l]=0;
        			 x[(int)r]=d;
        		 }
        	 }
         }


         if(f) {
        	 System.out.println("Yes");
         }else {
        	 System.out.println("No");
         }
         //System.out.println(ans);
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