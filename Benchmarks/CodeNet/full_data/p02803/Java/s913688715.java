
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         char[][] S=new char[H][W];

         for (int i=0;i<H;i++) {
        	 String s=gs();
        	 for (int j=0;j<W;j++) {
            	 S[i][j]=s.charAt(j);
             }
         }
         int max=0;
         for (int i=0;i<H;i++) {
        	 for (int j=0;j<W;j++) {
        		 if (S[i][j]=='.') {
            	     int[][] h=new int[H][W];
            	     for (int k=0;k<H;k++) {
                	     for (int l=0;l<W;l++) {
                    	     h[k][l]=Integer.MAX_VALUE;
                         }
                     }
            	     boolean flg=true;
            	     h[i][j]=0;
            	     while(flg) {
            	    	 flg=false;
            	    	 for (int k=0;k<H;k++) {
                    	     for (int l=0;l<W;l++) {
                        	     if(S[k][l]=='.') {
                        	    	 if(k-1>=0 && h[k-1][l]!=Integer.MAX_VALUE && h[k-1][l]+1<h[k][l]) {
                        	    		 h[k][l]=h[k-1][l]+1;
                        	    		 flg=true;
                        	    	 }
                        	    	 if(l-1>=0&& h[k][l-1]!=Integer.MAX_VALUE  && h[k][l-1]+1<h[k][l]) {
                        	    		 h[k][l]=h[k][l-1]+1;
                        	    		 flg=true;
                        	    	 }
                        	    	 if(k+1<H&& h[k+1][l]!=Integer.MAX_VALUE  && h[k+1][l]+1<h[k][l]) {
                        	    		 h[k][l]=h[k+1][l]+1;
                        	    		 flg=true;
                        	    	 }
                        	    	 if(l+1<W&& h[k][l+1]!=Integer.MAX_VALUE  && h[k][l+1]+1<h[k][l]) {
                        	    		 h[k][l]=h[k][l+1]+1;
                        	    		 flg=true;
                        	    	 }
                        	     }
                             }
                         }
            	     }
            	     int m=0;
            	     for (int k=0;k<H;k++) {
                	     for (int l=0;l<W;l++) {
                    	     if(h[k][l]!=Integer.MAX_VALUE) {
                    	    	 m=Math.max(m, h[k][l]);
                    	     }
                         }
                     }
            	     max=Math.max(max, m);
        		 }
             }
         }

         System.out.println(max);
     }

     // ユークリッドの互除法
     public static long uclid(long m, long n) {
     	if (m<n) {
 			m^=n;
 			n^=m;
 			m^=n;
 		}

 		while(true) {
 			long t=m%n;
 			if (t==0) {
 				return n;
 			} else {
 				m=n;
 				n=t;
 			}
 		}
     }

     public static int dt(long n) {
    	 if(n==0)return 0;
    	 int ret=0;
    	 while((n&1)==0) {
    		 n=n>>1;
             ret++;
    	 }
    	 return ret;
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