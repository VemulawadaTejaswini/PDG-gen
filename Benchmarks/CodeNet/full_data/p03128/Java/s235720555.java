
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     static int N;
     static int M;
     static List<Integer> A=new ArrayList<Integer>();
     static int[] order= {1, 7, 4, 5, 3, 2, 9, 6, 8};
     static int[] hon= {2,5,5,4,5,6,3,7,6};
     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         N=gi();
         M=gi();

         for(int i=0; i<M;i++) {
            A.add(gi());
         }

         Map<Integer, Integer> map=new HashMap<Integer, Integer>();
         f(map);
         StringBuilder sb=new StringBuilder();
         for (int i=9;i>0;i--) {
        	 if(map.containsKey(i)) {
        	     int v=map.get(i);
        	     String si=i+"";
        	     sb.append(String.join("", Collections.nCopies(v, si)));
        	 }
         }
         System.out.print(sb);
     }

     public static boolean f(Map<Integer, Integer> map) {
    	 int tn=N;
    	 for(Map.Entry<Integer, Integer> e:map.entrySet()) {
    		 tn-=hon[e.getKey()-1]*e.getValue();
    	 }

         for(int i=0; i<9;i++) {
              if(A.contains(order[i]) && (!map.containsKey(order[i]) || map.get(order[i])==0)) {
                   int a=tn%hon[order[i]-1];
                   if(a==0) {
                        map.put(order[i], tn/hon[order[i]-1]);
                        return true;
                   } else {
                	    int c=Math.floorDiv(tn, hon[order[i]-1]);
                	    if(c>0) {
                	        map.put(order[i], c);
                            while(map.get(order[i])!=0) {
                            	if(f(map)) {
                            		return true;
                            	}
                        	    map.put(order[i], map.get(order[i])-1);
                            }
                	    }
                   }
              }
         }

         return false;
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