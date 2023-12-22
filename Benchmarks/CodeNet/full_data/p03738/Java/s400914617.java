import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger  a = sc.nextBigInteger();
    BigInteger  b = sc.nextBigInteger();
    String ans = "";
    if(a.compareTo(b) > 0){
      ans = "GREATER";
    }else if(a.compareTo(b) < 0){
      ans = "LESS";
    }else{
      ans = "EQUAL";
    }

    System.out.println(ans);
    
  }
}