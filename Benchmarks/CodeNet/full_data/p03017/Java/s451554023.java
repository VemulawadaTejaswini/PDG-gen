
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int a=gi()-1;
         int b=gi()-1;
         int c=gi()-1;
         int d=gi()-1;
         String s=gs();

         int di=-1;
         boolean bs=false;
         for (int i=a; i<s.length(); i++) {
        	 char ch=s.charAt(i);
        	 if(bs) {
        		 if(ch=='#') {
        			 di=i-1;
        			 break;
        		 } else {
        			 bs=false;
        		 }
        	 } else {
        		 if(ch=='#') {
        			 bs=true;
        		 }
        	 }
         }

         if (di!=-1 && c>di) {
        	 System.out.println("No");
        	 return;
         }

         di=-1;
         bs=false;
         for (int i=b; i<s.length(); i++) {
        	 char ch=s.charAt(i);
        	 if(bs) {
        		 if(ch=='#') {
        			 di=i-1;
        			 break;
        		 } else {
        			 bs=false;
        		 }
        	 } else {
        		 if(ch=='#') {
        			 bs=true;
        		 }
        	 }
         }

         if (di!=-1 && d>di) {
        	 System.out.println("No");
        	 return;
         }

         if (c<d) {
        	 System.out.println("Yes");
        	 return;
         }

         int f=0;
         for (int i=b-1; i<d+1; i++) {
        	 char ch=s.charAt(i);
             if(ch=='#') {
        		 f=0;
             } else {
        		 f++;
             }
             if(f>=3) {
            	 System.out.println("Yes");
            	 return;
             }
         }
         System.out.println("No");

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