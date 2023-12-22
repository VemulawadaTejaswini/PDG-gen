
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] t=new long[N];
         long[] a=new long[N];
         long[] d=new long[N];
         long[] hn=new long[N];

         for(int i=0; i<N;i++) {
        	 t[i]=gl();
         }
         for(int i=0; i<N;i++) {
        	 a[i]=gl();
         }

         if(d[N-1]!=0 && d[N-1]!=a[N-1]) {
        	 hn[N-1]=0;
         } else {
        	 d[N-1]=a[N-1];
        	 hn[N-1]=1;
         }
         for(int i=0; i<N;i++) {
        	 hn[i]=Math.min(t[i], a[i]);
         }
         hn[0]=1;
         for(int i=1; i<N;i++) {
        	 if(t[i]!=t[i-1]) {
        		 hn[i]=1;
        	 }
         }
         hn[N-1]=1;
         for(int i=N-2; i>=0;i--) {
        	 if(a[i]!=a[i+1]) {
        		 if (hn[i]!=1) {
        		     hn[i]=1;
        		 } else {
        			 if(a[i]!=t[i]) {
        				 hn[i]=0;
        			 }
        		 }
        	 }
         }

         long ans=1;
         for(int i=0; i<N;i++) {
        	 ans*=hn[i];
        	 ans=ans%1000000007;
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