
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String s=gs();
         int a=0;
         int b=0;
         int c=0;

         for(int i=0; i<s.length();i++) {
        	 char ch=s.charAt(i);
        	 if(ch=='a') {
        		 a++;
        	 } else if(ch=='b') {
        		 b++;
        	 } else {
        		 c++;
        	 }
         }

         if(s.length()==1) {
        	 System.out.println("YES");
         } else if(s.length()==2) {
        	 if(a==2 || b==2 || c==2) {
        		 System.out.println("NO");
        	 } else {
        		 System.out.println("YES");
        	 }
         } else {
        	 int min=Math.min(Math.min(a, b), c);
        	 int max=Math.max(Math.max(a, b), c);
        	 if(min==0 || max-min>1) {
        		 System.out.println("NO");
        	 } else {
        		 System.out.println("YES");
        	 }
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