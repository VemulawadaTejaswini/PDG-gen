
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();

         StringBuilder sb=new StringBuilder();
         for (int i=0;i<N;i++) {
             sb.append('a');
         }

         while(true) {
        	 System.out.println(sb);
             boolean f=false;
        	 for (int j=0; j<N-1;j++) {
        		 char c1= sb.charAt(N-j-1);
        		 char c2= sb.charAt(N-j-2);
        		 if(c1<=c2) {
                     f=true;
        			 c1++;
        			 sb.setCharAt(N-j-1, c1);
        			 for (int k=N-j; k<N; k++) {
        				 sb.setCharAt(k, 'a');
        			 }
        			 break;
        		 }
        	 }
             if(!f) break;
         }

         //System.out.println(sb);
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