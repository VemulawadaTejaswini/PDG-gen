import java.util.*;
import java.math.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    int c = a.compareTo(b);
    if(c<0){
      System.out.println("LESS");
    }else if(c==0){
      System.out.println("EQUAL");
    }else{
      System.out.println("GREATER");
    }
  }
}