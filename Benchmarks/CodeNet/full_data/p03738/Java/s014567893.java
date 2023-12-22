import java.util.* ; 
import java.math.*;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

	BigInteger x = scan.nextBigInteger();
     BigInteger y = scan.nextBigInteger() ;
    
   int z  = x.compareTo(y) ;
      if(z < 0 )
      {
        System.out.println("LESS");
      }else if(z>0){
        System.out.println("GREATER");
      }else{
        System.out.println("EQUAL");
      }
    

     
  }
}
