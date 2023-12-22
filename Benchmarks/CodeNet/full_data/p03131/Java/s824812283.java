import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long K=gl();
         long a=gl();
         long b=gl();

         if(a>=b-2 || K+1<a+2) {
        	 System.out.println(K+1);
        	 return;
         }

         long ans=a;
         long c=b-a;
         K-=a-1;
         if (K%2==0) {
             ans+=(K/2)*c;
         } else {
        	 ans+=((K-1)/2)*c+1;
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