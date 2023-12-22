import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();

    long a = n % k;
    long b = Math.abs(a - k);

    if(a>b){
      System.out.println(b);
    }else{
      System.out.println(a);
    }


  }
}