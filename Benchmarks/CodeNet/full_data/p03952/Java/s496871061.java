

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int x=gi();
         int[] a=new int[2*N-1];
         List<Integer> f=new ArrayList<Integer>();

         if (x==1 || x==2*N-1) {
        	 System.out.println("No");
        	 return;
         } else {
        	 for(int i=0; i<2*N-1; i++) {
        		 a[i]=-1;
        	 }
        	 a[N-1]=x;
        	 a[N-2]=1;
        	 a[N]=2*N-1;
        	 f.add(x);
        	 f.add(1);
        	 f.add(2*N-1);
        	 if(N!=3 && x!=2) {
        		 a[N+1]=2;
        		 f.add(2);
        	 }
         }

         int ind=0;
         int v=1;
         while(ind<2*N-1) {
        	 if(a[ind]==-1) {
        		 while(f.contains(v)) {
        			 v++;
        		 }
        		 a[ind]=v;
        		 v++;
        		 ind++;
        	 } else {
        		 ind++;
        	 }
         }

         System.out.println("Yes");
         for(int i=0; i<2*N-1; i++) {
        	 System.out.println(a[i]);
    	 }
         //System.out.println(ans);
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