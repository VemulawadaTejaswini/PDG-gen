import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int L =  A.length();   
    // BigInteger S = new BigInteger(A);
    // Long A = sc.nextLong();
    // int L =  String.valueOf(A).length();   A
    // String S = A.toString();  
    // BigInteger S = 0;
    int c = 0;
    BigInteger x= BigInteger.valueOf(2019);
    BigInteger y= BigInteger.valueOf(0);
    for (int i=0; i < L -3; i++) {
      for (int j=i+3; j < L; j++) {
        String tmp = A.substring(i, j+1);
        BigInteger S  = new BigInteger(tmp);
        if(S.mod(x)==y){
          c++;
        }
      }

    }
    System.out.println(c);
    return;
  }
  
}

