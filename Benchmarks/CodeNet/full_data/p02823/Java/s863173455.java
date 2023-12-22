
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long N=gl();
         long a=gl();
         long b=gl();

         long ans=0;
    	 if((b-a)%2==0) {
    		 ans=(b-a)/2;
    	 } else {
    		 ans=(b-a-1)/2;
    		 ans+=Math.min(N-b, a);
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