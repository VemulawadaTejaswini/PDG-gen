import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long A=gl();
         long B=gl();

         long a=f(A-1);
         long b=f(B);
         System.out.print(a^b);



         //System.out.print(sb);
     }

     public static long f(long n) {
    	 if(n==0)return 0;
    	 if(n==1)return 1;
    	 if(n==2)return 3;
         if(n==3)return 0;
    	 int i=1;
    	 while(Math.pow(2, i)<=n) {
    		 i++;
    	 }

    	 long ret=0;
    	 if((n-Math.pow(2, i-1))%2==0) {
    		 ret+=Math.pow(2, i-1);
    	 }
    	 ret= ret + f((long)(n-Math.pow(2, i-1)));
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