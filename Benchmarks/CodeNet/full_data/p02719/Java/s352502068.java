import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    
    long remainder = N % K;
    
    System.out.println(Math.min(remainder, K-remainder));
  }
}
    