
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long x=gl();
         long y=gl();

         long ans=0;
         if((2*x-y) % 3==0 && (2*y-x) % 3==0) {
             long a=(2*x-y)/3;
             long b=(2*y-x)/3;
             long c=a+b;
             if(a>0 && b>0) {
             ans=1;
             if(a<b) {
                 while(c>b) {
            	     ans=(ans*c)%1000000007;
            	     c--;
                 }
                 while(a>0) {
                	 ans=(ans*modpow(a,1000000005, 1000000007))%1000000007;
                	 a--;
                 }
             } else {
            	 while(c>a) {
            	     ans=(ans*c)%1000000007;
            	     c--;
                 }
                 while(b>0) {
                	 ans=(ans*modpow(b,1000000005, 1000000007))%1000000007;
                	 b--;
                 }
             }
             }
         }

         System.out.println(ans);
     }
     
  // a^nをmodで割ったあまり
 	public static long modpow(long a, long n, long mod) {
 		long res=1;
 		while(n>0) {
 			if((n & 1) == 1) res=res*a%mod;
 			a=a*a%mod;
 			n=n>>1;
 		}

 		return res;
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