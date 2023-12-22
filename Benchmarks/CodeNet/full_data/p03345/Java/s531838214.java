import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long K = sc.nextLong();
    long a =0;
    long b =0;
    long c =0;
    
    for(long i=1; i<K; i++){
      a = B + C;
      b = A + C;
      c = A + B;
    }
    if (Math.abs(a-b)<=Math.pow(10, 18)){
      System.out.println("unfair");
    }else{
      System.out.println(a-b);
    }
  }
}
    