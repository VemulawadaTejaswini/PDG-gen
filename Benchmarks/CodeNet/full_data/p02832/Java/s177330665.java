
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         long ans=0;
         long tmp=1;
         for (int i=0; i<N;i++) {
        	 a[i]=gl();
        	 if(tmp==a[i]) {
        		 tmp++;
        	 } else {
        		 ans++;
        	 }
         }

         if(tmp==1) {
        	 System.out.println(-1);
         } else {
        	 System.out.println(ans);
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