
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
                	 if(a[i][j]==Integer.MAX_VALUE) {
                		 flg=true;
                		 continue;
                	 }
                     if(i-1>=0) {
                    	 a[i-1][j]=Math.min(a[i-1][j], a[i][j]+1);
                     }
                     if(j-1>=0) {
                    	 a[i][j-1]=Math.min(a[i][j-1], a[i][j]+1);
                     }
                     if(i+1<H) {
                    	 a[i+1][j]=Math.min(a[i+1][j], a[i][j]+1);
                     }
                     if(j+1<W) {
                    	 a[i][j+1]=Math.min(a[i][j+1], a[i][j]+1);
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