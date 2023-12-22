
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N];
         int[] b=new int[N];
         int[] c=new int[N];
         List<Integer> lp=new ArrayList<Integer>();
         List<Integer> lm=new ArrayList<Integer>();

         int sa=0;
         for (int i=0; i<N;i++) {
             a[i]=gi();
             sa+=a[i];
         }
         int sb=0;
         for (int i=0; i<N;i++) {
             b[i]=gi();
             sb+=b[i];
         }
         if(sa<sb) {
        	 System.out.println(-1);
        	 return;
         }
         int p=0;
         int m=0;
         for (int i=0; i<N;i++) {
             c[i]=a[i]-b[i];
             if(c[i]<0) {
            	 m++;
            	 lm.add(c[i]);
             } else {
            	 lp.add(c[i]);
             }
         }
         if (m==0) {
             System.out.println(0);
             return;
         }

         Collections.sort(lp, Collections.reverseOrder());
         int ind=0;
         for (int i=0; i<lm.size(); i++) {
        	 int v=lm.get(i);
             while (v<0) {
            	 int pv=lp.get(ind);
            	 if(pv+v<=0) {
            		 ind++;
            		 v+=pv;
            	 } else {
            		 lp.set(ind, pv+v);
            		 v=0;
            	 }
             }
         }

             System.out.println(m+ind+1);

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