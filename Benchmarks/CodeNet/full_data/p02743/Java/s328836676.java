import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.math.BigInteger;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long a = Long.parseLong(scan.next()); //a
    long b = Long.parseLong(scan.next()); //b
    long c = Long.parseLong(scan.next()); //c
    
    BigInteger left = BigInteger.valueOf((- 1) * (a - b) * (a - b));
    BigInteger right = BigInteger.valueOf(c * ( c - 2 * ( a + b )));
       
    if((left.compareTo(right))== -1){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}