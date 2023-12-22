import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      long N =sc.nextLong();
      long K =sc.nextLong();

      long P = N % K;
      
      System.out.println(Math.min(P,K-P));
    }
}