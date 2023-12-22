import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long a;
    long b;
    long x;
    
    if(N==K){
      System.out.println(0);
    } else if(N == 0) {
      System.out.println(K);
    } else {
      if(N<K) {
        a = K;
        b = N;
      } else {
        a = N;
        b = K;
      }
      while(a % b != 0) {
        if(a % b == 1){
          b = 0;
          break;
        }
        x = a % b;
        a = b;
        b = x;
      }
      System.out.println(b);
    }
  }
}