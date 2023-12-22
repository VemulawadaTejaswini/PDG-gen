
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long N=gl();
         long K=gl();

         long ans=0;
         for (long b=K+1; b<=N;b++) {
        	 long s=Math.floorDiv(N, b);
        	 ans+=(b-K)*s;
        	 long t=N%b;
        	 ans+=Math.max(0, t-(K-1));
        	 if(K==0)ans--;
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