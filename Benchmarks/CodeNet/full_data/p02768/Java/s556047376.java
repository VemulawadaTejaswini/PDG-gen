
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long N=gl();
         long a=gl();
         long b=gl();
         long ans=modpow(2,N,1000000007)-1;
         long nca=1;
         long ncb=1;
         a=Math.min(a, N-a);
         b=Math.min(b, N-b);
         long now=N;
         while(now>N-a) {
        	 nca*=now;
        	 nca=nca%1000000007;
        	 now--;
         }

         now=a;
         while(now>0) {
        	 nca*=modpow(now, 1000000005, 1000000007);
        	 nca=nca%1000000007;
        	 now--;
         }

         now=N;
         while(now>N-b) {
        	 ncb*=now;
        	 ncb=ncb%1000000007;
        	 now--;
         }

         now=b;
         while(now>0) {
        	 ncb*=modpow(now, 1000000005, 1000000007);
        	 ncb=ncb%1000000007;
        	 now--;
         }
         ans=(ans+2*1000000007-nca-ncb)%1000000007;

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

     public static long f(long n) {
    	 if(n==1)return 1;
    	 return 2*f(n>>1);
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