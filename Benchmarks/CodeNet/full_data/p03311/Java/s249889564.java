
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         
         long avg=0;
         for(int i=0; i<N;i++) {
        	 a[i]=gl()-i-1;
        	 avg+=a[i];
         }
         
         avg=Math.floorDiv(avg, N);
         
         long s1=0;
         long s2=0;
         for(int i=0; i<N; i++) {
        	 s1+=Math.abs(a[i]-avg);
        	 s2+=Math.abs(a[i]-avg-1);
         }
         

         long ans=Math.min(s1, s2);
         

         System.out.println(ans);
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