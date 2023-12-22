import java.util.* ;
public class Main{
 public static void main(String []args){
 	Scanner sc = new Scanner(System.in) ;
    long  a = sc.nextInt() ; 
    long  b = sc.nextInt() ;
   return a*b/gcd(a,b ) ;
    
 }
  static long gcd(int a , int b ) { 
   if (b == 1 ) 
     return a ;
    else
      return gcd(b , a%b ) ;
  }
  
}