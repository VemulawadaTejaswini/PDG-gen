import java.util.*;
import java.math.BigInteger;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt() ;
      int b =scan.nextInt();
      int c =scan.nextInt();
      int d = scan.nextInt();
      
      int x1 = Math.max(a,c);
      int x2 = Math.min(b,d);
      System.out.println((x2-x1)>0 ? (x2-x1) : 0) ;
    }
}