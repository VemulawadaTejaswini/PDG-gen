

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N];

         for(int i=0; i<N;i++) {
        	 a[i]=gi();
         }

         int ans=0;
         for (int i=0; i<N;i++) {
        	 if(a[i]%2==0) {
        		 ans+=a[i]/2;
        		 a[i]=0;
        	 } else {
        		 ans+=Math.floorDiv(a[i], 2);
        		 if (i+1<N && a[i+1]>0) {
        			 ans++;
        			 a[i]=0;
        			 a[i+1]--;
        		 }
        	 }
         }

         System.out.println(ans);
         //System.out.println(ans);
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