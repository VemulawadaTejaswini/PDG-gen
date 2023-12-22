

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[][] dp=new long[10][10];
         long ans=0;
         for (int i=1;i<=N;i++) {
        	 if(i%10!=0) {
        	     String s=Nsin(i,10);
        	     int a=Integer.parseInt(s.substring(0,1));
        	     int b=i%10;
        	     if(a==b)ans++;
        	     ans+=dp[b][a]*2;
        	     dp[a][b]++;
        	 }
         }


         System.out.println(ans);
     }

  // s進数で表した時の文字列
 	public static String Nsin(int n, int s) {
 		if(n==0) return "0";

 		StringBuffer sb=new StringBuffer();
 		while(n!=0) {
 			int a=n%s;
 			sb.append(a);
 			n=(n-a)/s;
 		}

 		return sb.reverse().toString();
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