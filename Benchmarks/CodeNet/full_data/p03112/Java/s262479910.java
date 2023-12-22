
import java.util.AbstractMap;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int A=gi();
         int B=gi();
         int Q=gi();
         long[] s=new long[A];
         long[] t=new long[B];
         long[] x=new long[Q];

         for(int i=0; i<A;i++) {
            s[i]=gl();
         }
         for(int i=0; i<B;i++) {
             t[i]=gl();
          }
         for(int i=0; i<Q;i++) {
             x[i]=gl();
             int sl=0;
             int sr=A;
             while(sr-sl>1) {
            	 int ind=(sl+sr)/2;
            	 if(x[i]>=s[ind]) {
            		 sl=ind;
            	 } else {
            		 sr=ind;
            	 }
             }
             int tl=0;
             int tr=B;
             while(tr-tl>1) {
            	 int ind=(tl+tr)/2;
            	 if(x[i]>=t[ind]) {
            		 tl=ind;
            	 } else {
            		 tr=ind;
            	 }
             }
             long d=0;
             if(x[i]-s[sl]>=0 && x[i]-t[tl]>=0) {
                 d=Math.max(x[i]-s[sl], x[i]-t[tl]);
                 if(sl<A-1) {
            	     d=Math.min(d, 2*(s[sl+1]-x[i])+x[i]-t[tl]);
            	     d=Math.min(d, 2*(x[i]-t[tl])+s[sl+1]-x[i]);
            	     if(tl<B-1) {
            		     d=Math.min(d, Math.max(s[sl+1]-x[i], t[tl+1]-x[i]));
            		     d=Math.min(d, 2*(x[i]-s[sl])+t[tl+1]-x[i]);
            	     }
                 } else if(tl<B-1){
            	     d=Math.min(d, 2*(x[i]-s[sl])+t[tl+1]-x[i]);
            	     d=Math.min(d, 2*(t[tl+1]-x[i])+x[i]-s[sl]);
                 }
             } else if(x[i]-s[sl]>=0) {
            	 d=2*(t[tl]-x[i])+x[i]-s[sl];
            	 d=Math.min(d, 2*(x[i]-s[sl])+t[tl]-x[i]);
            	 if(sl<A-1) {
            	     d=Math.min(d,Math.max(t[tl]-x[i], s[sl+1]-x[i]));
            	 }
             } else if(x[i]-t[tl]>=0) {
            	 d=2*(s[sl]-x[i])+x[i]-t[tl];
            	 d=Math.min(d, 2*(x[i]-t[tl])+s[sl]-x[i]);
            	 if(tl<B-1) {
            	     d=Math.min(d,Math.max(s[sl]-x[i], t[tl+1]-x[i]));
            	 }
             } else {
            	 d=Math.max(s[sl]-x[i], t[tl]-x[i]);
             }
             System.out.println(d);

          }


         //System.out.print(sb);
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