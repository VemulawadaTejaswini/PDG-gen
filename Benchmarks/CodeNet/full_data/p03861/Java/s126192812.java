import java.util.*;
import java.math.BigInteger;
  class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  
      long a = sc.nextInt();
      long b = sc.nextInt();
      long x = sc.nextInt();
      long count = 0;
      
      for(long i=a;i<=b;i++){
        if(i%x == 0){
          count += 1;
        }
      }
      BigInteger num = BigInteger.valueOf(count);
      
      System.out.println(num);
  }
}