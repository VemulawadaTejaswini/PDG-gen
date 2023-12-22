
import java.util.AbstractMap;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         String[] S=new String[H];
         int[][][] c=new int[2][H][W];

         for(int i=0; i<H;i++) {
        	 S[i]=gs();
         }

         long max=0;

         for(int i=0; i<H;i++) {
        	 for(int j=0; j<W;j++) {
        	     char m=S[i].charAt(j);
        	     if(m=='.') {
        	    	 if(c[0][i][j]==0) {
        	    		 int n=1;
        		         for(int k=i+1; k<H;k++) {
                             char m2=S[k].charAt(j);
                             if(m2=='.') {
                            	 n++;
                             } else {
                            	 break;
                             }
                         }
        		         for(int k=i; k<i+n;k++) {
                             c[0][k][j]=n;
                         }
        	    	 }
        	    	 if(c[1][i][j]==0) {
        	    		 int n=1;
        		         for(int k=j+1; k<W;k++) {
                             char m2=S[i].charAt(k);
                             if(m2=='.') {
                            	 n++;
                             } else {
                            	 break;
                             }
                         }
        		         for(int k=j; k<j+n;k++) {
                             c[1][i][k]=n;
                         }
        	    	 }
        	    	 max=Math.max(max, c[0][i][j]+c[1][i][j]-1);
        	     }
             }
         }

         System.out.print(max);
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