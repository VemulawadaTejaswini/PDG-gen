

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String S=gs();
         long[] a=new long[S.length()+1];

         long tmp=0;
    	 for(int i=0; i<S.length();i++) {
    		 char c=S.charAt(i);
    		 if(c=='<') {
    			 a[i]=tmp;
    			 a[i+1]=tmp+1;
    			 tmp++;
    		 } else {
    			 tmp=0;
    		 }
    	 }

    	 tmp=0;
    	 for(int i=S.length()-1; i>=0;i--) {
    		 char c=S.charAt(i);
    		 if(c=='>') {
    			 a[i+1]=Math.max(a[i+1], tmp);
    			 a[i]=Math.max(a[i], tmp+1);
    			 tmp++;
    		 } else {
    			 tmp=0;
    		 }
    	 }
    	 long ans=0;
    	 for(int i=0; i<S.length()+1;i++) {
    		 ans+=a[i];
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