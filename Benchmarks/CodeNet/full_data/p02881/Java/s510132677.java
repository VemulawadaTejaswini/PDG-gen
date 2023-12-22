import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();

    long b = Long.MAX_VALUE /2;
    long c = Long.MAX_VALUE /2;
    for(long i = (a-1)2; i > 0; i--){
      if(a % i == 0){
        if((a/i + i) < (b + c) ){
          b = a/i;
          c = i;
        }
      }
    }
    System.out.println(b + c -2);
  }
}
