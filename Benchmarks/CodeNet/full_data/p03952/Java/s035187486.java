
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int x=gi();
         int[] a=new int[2*N];

         if (x==1 || x==2*N-1) {
        	 System.out.println("No");
        	 return;
         } else {
        	 for(int i=1; i<=2*N-1; i++) {
        		 a[i]=i;
        	 }
        	 int tmp=a[N];
        	 a[N]=x;
        	 a[x]=tmp;
        	 tmp=a[N-1];
        	 a[N-1]=1;
        	 a[1]=tmp;
        	 tmp=a[N+1];
        	 a[N+1]=2*N-1;
        	 a[2*N-1]=tmp;
        	 if(N!=3) {
        		 tmp=a[N+2];
        		 a[N+2]=2;
        		 a[2]=tmp;
        	 }
         }


         System.out.println("Yes");
         for(int i=1; i<=2*N-1; i++) {
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