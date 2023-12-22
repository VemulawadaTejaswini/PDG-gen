
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int x=gi();
         int[] a=new int[2*N-1];
         boolean[] b=new boolean[2*N];
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
        	 b[1]=true;
        	 b[2*N-1]=true;
        	 b[x]=true;
        	 if(N!=3) {
        		 a[N+1]=2;
        		 b[2]=true;
        	 }
         }

         int ind=0;
         int v=2;
         while(ind<2*N-1) {
    		 if(a[ind]==-1) {
    			 if(b[v]) {
                     v++;
    			 } else {
    				 b[v]=true;
    				 a[ind]=v;
    				 ind++;
    				 v++;
    			 }
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