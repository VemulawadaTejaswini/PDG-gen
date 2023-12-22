
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         int[][] a=new int[H][W];

         for(int i=0; i<H;i++) {
        	 String s=gs();
             for(int j=0; j<W;j++) {
                 char c=s.charAt(j);
                 if(c=='#') {
                     a[i][j]=0;
                 } else {
                	 a[i][j]=Integer.MAX_VALUE;
                 }
             }
          }

         boolean flg=true;
         while(flg) {
        	 flg=false;
        	 for(int i=0; i<H;i++) {
                 for(int j=0; j<W;j++) {
                	 if(a[i][j]==0) continue;
                     int min=Integer.MAX_VALUE-1;
                     if(i-1>=0) {
                    	 min=Math.min(min, a[i-1][j]);
                     }
                     if(j-1>=0) {
                    	 min=Math.min(min, a[i][j-1]);
                     }
                     if(i+1<H) {
                    	 min=Math.min(min, a[i+1][j]);
                     }
                     if(j+1<W) {
                    	 min=Math.min(min, a[i][j+1]);
                     }
                     if(min+1<a[i][j]) {
                    	 a[i][j]=min+1;
                    	 flg=true;
                     }
                 }
              }
         }
         int t=0;
         for(int i=0; i<H;i++) {
             for(int j=0; j<W;j++) {
                 if(a[i][j]!=Integer.MAX_VALUE) {
                	 t=Math.max(t, a[i][j]);
                 }
             }
          }

         System.out.println(t);
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