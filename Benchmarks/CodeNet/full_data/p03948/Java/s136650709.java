
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long T=gl();
         int[] A=new int[N];
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         int ans=0;
         for(int i=0; i<N;i++) {
        	 A[i]=gi();
        	 min=Math.min(min, A[i]);
        	 if(A[i]-min>max) {
        		 max=A[i]-min;
        		 ans=1;
        	 } else if(A[i]-min==max) {
        		 ans++;
        	 }
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