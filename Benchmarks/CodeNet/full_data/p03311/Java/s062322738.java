import java.util.Arrays;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         
         for(int i=0; i<N;i++) {
        	 a[i]=gl()-i-1;
         }
         
         Arrays.parallelSort(a);
         
         long b1=a[Math.floorDiv(N, 2)];
         long ans=0;
         for(int i=0; i<N; i++) {
             ans+=Math.abs(a[i]-b1);
         }

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